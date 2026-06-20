package com.example.demospring.Controller;


import com.example.demospring.Entity.Teacher;
import com.example.demospring.service.TeacherService;
import com.example.demospring.service.TeacherServiceImpli;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Table(name = "Teach")
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    //fetch all id
    @GetMapping
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @GetMapping
    public  Teacher getTeacherById(Long id){
        return teacherService.getTeacherById(id);
    }
}
