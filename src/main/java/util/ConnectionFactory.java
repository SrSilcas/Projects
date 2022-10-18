package util;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * @author Lucas Silva Arruda Chagas
 * class util ConnectionFactory do get connectoin and close connection with database
 */

public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    //method to get connection
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (Exception ex){
            throw new RuntimeException("Error to get connection", ex);
        }
    }
    // methods to close connection
    public static void closeConnection(Connection connection){
        try {
            if (connection != null){
                connection.close();
            }
        }catch (Exception ex){
            throw new RuntimeException("Error to close connection", ex);
        }
    }
    public static void closeConnection(Connection connection, PreparedStatement statement){
        try {
            if (connection != null){
                connection.close();
            }
            if (statement != null){
                statement.close();
            }
        }catch (Exception ex){
            throw new RuntimeException("Error to close connection", ex);
        }
    }
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet result){
        try {
            if (connection != null){
                connection.close();
            }
            if (statement != null){
                statement.close();
            }
            if (result != null){
                result.close();
            }
        }catch (Exception ex){
            throw new RuntimeException("Error to close connection", ex);
        }
    }
}
