package com.example.demo.service;

import com.example.demo.mapper.TaskMapper;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskMapper mapper;

    @Autowired
    public TaskServiceImpl(TaskMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Task> findAll() {
        return mapper.findAll();
    }

    @Override
    public void save(Task task) {
        mapper.insert(task);
    }
}
