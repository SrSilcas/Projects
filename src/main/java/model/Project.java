package model;

import java.util.Date;

/**
 * @author Lucas Silva Arruda Chagas
 * class model Project
 */

public class Project {

    private int id;
    private String name;
    private String description;
    private Date createdAt;
    private Date updatedAt;

    //constructor
    public Project(int id, String name, String description, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Project() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    //to string
    @Override
    public String toString() {
        return this.name;
    }
}
