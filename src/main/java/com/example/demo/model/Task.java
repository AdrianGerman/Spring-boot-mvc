package com.example.demo.model;

import java.util.Date;

public class Task {
    private int id;
    private String name;
    private String description;
    private Date init_date;  

    // Getters y Setters
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

    public Date getInitDate() {
        return init_date;
    }

    public void setInitDate(Date initDate) {
        this.init_date = initDate;
    }
}