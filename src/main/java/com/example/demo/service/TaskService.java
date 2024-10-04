package com.example.demo.service;

import com.example.demo.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
    void save(Task task);
}
