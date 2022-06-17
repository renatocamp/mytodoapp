
package mytodoapp.controller;

import java.util.List;
import mytodoapp.model.Task;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mytodoapp.util.ConnectionDataBase;


public class TaskController {
    
    public void saveTask(Task task) throws SQLException{
        
        String sql = "insert into tasks (idProject, "
                + "nome, "
                + "descricao, "
                + "completed, "
                + "notes," 
                + "deadline, "
                + "createdDate,"
                + "updateDate, "
                + "deadlineTermino) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionDataBase.getConnection();
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setString(6, task.getDeadLine());
            statement.setString(7, task.getDeadlineTermino());
            statement.setString(8, task.getCreatedDate());
            statement.setString(9, task.getUpdateDate());
            statement.execute();
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao salvar no Banco de Dados", 
                    e.getMessage(),e);
        
        }finally{
            ConnectionDataBase.closeConnection(conn, statement);
        }
       
    }
    
    public void updateTask(Task task) throws SQLException{
        
        String sql = "UPTADE tasks SET "
                + "idProject = ?, "
                + "nome=?, "
                + "descricao=?, "
                + "completed= ?,"
                + "notes= ?, "
                + "deadline= ?, "
                + "deadlineTermino = ?, "
                + "createDate = ?, "
                + "updateDate = ?"
                + "WHERE id = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = ConnectionDataBase.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, task.getIdProject());
            ps.setString(2, task.getName());
            ps.setString(3, task.getDescription());
            ps.setBoolean(4, task.isIsCompleted());
            ps.setString(5, task.getNotes());
            ps.setString(6,task.getDeadLine());
            ps.setString(7, task.getDeadlineTermino());
            ps.setString(8, task.getCreatedDate());
            ps.setString(9, task.getUpdateDate());
            ps.setInt(10, task.getId());
            ps.execute();
            
        } catch (SQLException ex) {
            
            throw  new SQLException("Erro ao atualizar as tarefas",ex.getMessage(),ex); 
            
        }finally{
            ConnectionDataBase.closeConnection(conn, ps);
        }
    }
    
    public void removeById(int taskId) throws SQLException{
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
           conn = ConnectionDataBase.getConnection();
           statement = conn.prepareStatement(sql);
           statement.setInt(1, taskId);
           statement.execute();
           
        } catch (SQLException ex) {
            throw  new SQLException("Erro ao deletar a tarefa",ex.getMessage(),ex);  
        }finally{
            ConnectionDataBase.closeConnection(conn, statement);
        }
        
    }
    
    public List<Task> getAllTasks(int idProject){
        
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        
        List<Task> tasks = new ArrayList<>();
        
        try {
            conn = ConnectionDataBase.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, idProject);
            
            resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setIdProject(resultSet.getInt("idProject"));
                task.setName(resultSet.getString("nome"));
                task.setDescription(resultSet.getString("descricao"));
                task.setIsCompleted(resultSet.getBoolean("completed"));
                task.setNotes(resultSet.getString("notes"));
                task.setDeadLine(resultSet.getString("deadline"));
                task.setDeadlineTermino(resultSet.getString("deadlineTermino"));
                task.setCreatedDate(resultSet.getString("createdDate"));
                task.setUpdateDate(resultSet.getString("updateDate"));
                
                tasks.add(task);
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar a lista de tarefas" 
                    + e.getMessage(),e);
        }finally{
            ConnectionDataBase.closeConnection(conn, ps, resultSet);
        }
        
        //Lista de tarefas que foi carregada do banco de dados
        return tasks;
    }
}
