
package mytodoapp.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mytodoapp.model.Project;
import mytodoapp.util.ConnectionDataBase;

public class ProjectController {
    
    public void saveProject(Project project){
        
        String sql = "insert into projects (nome, descricao) "
                + "values (? ,? );";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            
            conn = ConnectionDataBase.getConnection();
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.execute();
            
        } catch (SQLException e) {
            throw  new RuntimeException("Erro ao salvar o projeto" 
                    + e.getMessage(), e);
        }finally{
            ConnectionDataBase.closeConnection(conn, ps);
        }
    }
    
    public void updateProject(Project project){
        
        String sql = "UPDATE project SET"
                + "nome =?,"
                + "descricao=?,"
                + "WHERE id = ?";
        
        // Instanciando as Interfaces para Conexão e Preparação da Query
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = ConnectionDataBase.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.execute();
            
        } catch (Exception e) {
            throw  new RuntimeException("Erro ao atualizar o projeto" + e.getMessage(),e);
        }finally{
            ConnectionDataBase.closeConnection(conn, ps);
        }
        
    }
    
    public void removeById(int projectId) throws Exception{
        
        String sql = "DELETE FROM projects WHERE id= ?";
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = ConnectionDataBase.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, projectId);
            ps.execute();
            
        } catch (Exception e) {
            
            throw new Exception("Erro ao remover o projeto" + e.getMessage(),e);
            
        }finally{
            
            ConnectionDataBase.closeConnection(conn, ps);
        }
    }
    
    public List<Project> getAllProjects(){
        
        List<Project> projects = new ArrayList<>();
        
        String sql = "SELECT * FROM projects";
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        
        try {
            
            conn = ConnectionDataBase.getConnection();
            ps = conn.prepareStatement(sql);
            
            resultSet = ps.executeQuery();
            
            while(resultSet.next()){
                
                Project p = new Project();
                
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("nome"));
                p.setDescription(resultSet.getString("descricao"));
                
                projects.add(p);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar os projetos" + e.getMessage(),e);
        
        }finally{
            ConnectionDataBase.closeConnection(conn, ps, resultSet);
        }
        
        return projects;
    }
}
