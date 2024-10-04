package com.example.demo.mapper;

import com.example.demo.model.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskMapper {

    @Select("SELECT * FROM Task")
    List<Task> findAll();

    @Insert("INSERT INTO Task(name, description, init_date) VALUES(#{name}, #{description}, #{initDate})")
    void insert(Task task);
}