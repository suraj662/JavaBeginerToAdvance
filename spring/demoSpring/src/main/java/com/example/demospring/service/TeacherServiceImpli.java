package com.example.demospring.service;


import com.example.demospring.Entity.Teacher;
import com.example.demospring.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//implimentation or bussiness logic
@Service
public class TeacherServiceImpli {
    @Autowired
    private TeacherRepository teacherRepository;

    //fetch all id
    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }

    //fetch by id
    public Teacher getTeacherbyId(Long id){
        return teacherRepository.findById(id).orElse(null);
    }
}
