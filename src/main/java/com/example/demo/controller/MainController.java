package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add-task")
    public String addTask() {
        return "addTask";
    }

    @GetMapping("/list-task")
    public String listTask(Model model) {
        List<Task> tasks = taskService.findAll();
        model.addAttribute("tasks", tasks);
        return "listTask";
    }

    @PostMapping("/add-task")
    public String agregarTarea(@RequestParam("name") String name,
                               @RequestParam("description") String description,
                               @RequestParam("initDate") String initDate) {
        try {
            Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(initDate);

            Task task = new Task();
            task.setName(name);
            task.setDescription(description);
            task.setInitDate(parsedDate);

            taskService.save(task);

            return "redirect:/list-task";
        } catch (ParseException e) {
            e.printStackTrace();
            return "error"; 
        }
    }
}
