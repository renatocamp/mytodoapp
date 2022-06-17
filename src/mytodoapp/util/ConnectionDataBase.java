
package mytodoapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
This class will be used to connect my app with the Database
I'll be using MySQL Connector 
*/
public class ConnectionDataBase {
    
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mytodoapp";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conexão com o Banco de Dados", e);
        }
        
    }
    
    public static void closeConnection(Connection connection){
        
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            throw  new RuntimeException("Erro ao fechar a conexão com o Banco de Dados", e);
        }
    }
    
    public static void closeConnection(Connection connection, 
            PreparedStatement statement){
        
        try {
            if(connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
        } catch (SQLException e) {
            throw  new RuntimeException("Erro ao fechar a conexão com o Banco de Dados", e);
        }
    }
    
    public static void closeConnection(Connection connection, 
            PreparedStatement statement, ResultSet resultSet){
        
        try {
            if(connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
            
            if(resultSet != null){
                resultSet.close();
            }
            
        } catch (SQLException e) {
            throw  new RuntimeException("Erro ao fechar a conexão com o Banco de Dados", e);
        }
    }
}
