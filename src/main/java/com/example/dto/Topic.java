package com.example.dto;

public class Topic {

    private String id;

    public Topic() {
    }

    private String Name;

    public Topic(String id, String name, String description) {
        this.id = id;
        Name = name;
        Description = description;
    }

    private String Description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
