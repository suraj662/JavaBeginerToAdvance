package com.example.demospring.service;

import com.example.demospring.Entity.Teacher;

import java.util.List;

public interface TeacherService {
    //fetch all id
    List<Teacher> getAllTeacher();

    //fetch teacher by id
    Teacher getTeacherById(Long id);
}
