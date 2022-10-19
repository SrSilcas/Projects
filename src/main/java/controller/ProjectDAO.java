package controller;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import model.Project;
import util.ConnectionFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucas Silva Arruda Chagas
 * class controller ProjectDAO with methods save, remove, getAll and updated.
 */

public class ProjectDAO {

    public static void saveProject(Project project){

        String SQL= "INSERT INTO projects (name, description, createdAt, updatedAt)" +
                "VALUES (?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement statement = null;

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));

            statement.execute();
        }catch (Exception ex){
            throw new RuntimeException("Error to save project into database", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public static void removeById(int idProject){

        String SQL= "DELETE FROM projects WHERE id = ?";

        Connection connection =  null;
        PreparedStatement statement = null;

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            statement.setInt(1, idProject);

            statement.execute();

        }catch (Exception ex){
            throw new RuntimeException("Error to remove project from database", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }

    }
    public static void update(Project project){
        String SQL= "UPDATE projects SET name = ?, description = ?, updatedAt = ?" +
                "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getUpdatedAt().getTime()));

            statement.setInt(4, project.getId());

            statement.execute();
        }catch (Exception ex){
            throw new RuntimeException("Error to updated project", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public static List<Project> getAll(){

        String SQL= "SELECT * FROM projects";
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        List<Project> projects = new ArrayList<>();

        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(SQL);

            result = statement.executeQuery();

            while (result.next()){
                Project project = new Project();
                project.setId(result.getInt("id"));
                project.setName(result.getString("name"));
                project.setDescription(result.getString("description"));
                project.setCreatedAt(result.getDate("createdAt"));
                project.setUpdatedAt(result.getDate("updatedAt"));

                projects.add(project);
            }
        }catch (Exception ex){
            throw new RuntimeException("Error to get projects", ex);
        }finally {
            ConnectionFactory.closeConnection(connection, statement, result);
        }
        return projects;
    }
}
