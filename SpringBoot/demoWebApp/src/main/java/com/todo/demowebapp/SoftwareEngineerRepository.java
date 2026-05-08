package com.todo.demowebapp;


import org.springframework.data.jpa.repository.JpaRepository;

//to fetch data
public interface SoftwareEngineerRepository
        extends JpaRepository<SoftwareEngineer , Integer> {

}
