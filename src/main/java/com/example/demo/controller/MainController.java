package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add-task")
    public String addTask() {
        return "addTask";
    }

    @GetMapping("/list-task")
    public String listTask() {
        return "listTask";
    }
    
    
}
