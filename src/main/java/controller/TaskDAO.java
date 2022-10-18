package controller;

import com.mysql.jdbc.Connection;
import model.Task;
import util.ConnectionFactory;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucas Silva Arruda Chagas
 * class controller TaskDAO have methods save, remove, updated, getAll and getByIdProject.
 */
public class TaskDAO {
    public static void saveTask(Task task){

        String SQL= "INSERT INTO tasks (idproject, name, description, notes, status, deadline, createdAt, updatedAt)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.isStatus());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new Date(task.getUpdatedAt().getTime()));

            statement.execute();
        }catch (Exception ex){
            throw new RuntimeException("Error to save tasks into database", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public static void removeById(int idTask){
        String SQL= "DELETE FROM tasks WHERE id = ?";

        Connection connection =  null;
        PreparedStatement statement = null;

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            statement.setInt(1, idTask);

            statement.execute();

        }catch (Exception ex){
            throw new RuntimeException("Error to remove task from database", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }
    public static void updated(Task task){
        String SQL= "UPDATED tasks SET name = ?, description = ?, notes = ?, status = ?, deadline = ?, updatedAt = ?" +
                "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            statement.setString(1, task.getName());
            statement.setString(2, task.getDescription());
            statement.setString(3, task.getNotes());
            statement.setBoolean(4, task.isStatus());
            statement.setDate(5, new Date(task.getDeadline().getTime()));
            statement.setDate(6, new Date(task.getUpdatedAt().getTime()));

            statement.setInt(7, task.getId());

            statement.execute();
        }catch (Exception ex){
            throw new RuntimeException("Error to updated project", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public static List<Task> getAll(){
        String SQL= "SELECT * FROM tasks";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        List<Task> tasks = new ArrayList<>();

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            result = statement.executeQuery();

            while (result.next()){
                Task task = new Task();
                task.setId(result.getInt("id"));
                task.setIdProject(result.getInt("idproject"));
                task.setName(result.getString("name"));
                task.setDescription(result.getString("description"));
                task.setNotes(result.getString("notes"));
                task.setStatus(result.getBoolean("status"));
                task.setDeadline(result.getDate("deadline"));
                task.setCreatedAt(result.getDate("createdAt"));
                task.setUpdatedAt(result.getDate("updatedAt"));

                tasks.add(task);
            }
        }catch (Exception ex){
            throw new RuntimeException("Error to get projects", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement, result);
        }
        return tasks;
    }
    public static List<Task> getByIdProject(int idProject){
        String SQL= "SELECT * FROM tasks WHERE idproject = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        List<Task> tasks = new ArrayList<>();

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            statement.setInt(1, idProject);

            result = statement.executeQuery();

            while (result.next()){
                Task task = new Task();
                task.setId(result.getInt("id"));
                task.setIdProject(result.getInt("idproject"));
                task.setName(result.getString("name"));
                task.setDescription(result.getString("description"));
                task.setNotes(result.getString("notes"));
                task.setStatus(result.getBoolean("status"));
                task.setDeadline(result.getDate("deadline"));
                task.setCreatedAt(result.getDate("createdAt"));
                task.setUpdatedAt(result.getDate("updatedAt"));

                tasks.add(task);
            }
        }catch (Exception ex){
            throw new RuntimeException("Error to get projects", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement, result);
        }
        return tasks;
    }

}
