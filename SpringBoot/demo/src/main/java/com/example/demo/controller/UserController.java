package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.UserService;   // adjust if package changes later
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //send data requests of db row of users table, and data added into them
    //POST - http://localhost:8080/user/
    //ex - {
    //  "name": "Suraj Yadav",
    //  "age": 25
    //}
    @PostMapping()
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //update data of existing db buy id
    //PUT - http://localhost:8080/user/1
    //ex - {
    //  "name": "Suraj Dev Yadav",
    //  "age": 25
    //}
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    //delete data of existing db by id
    //DELETE - http://localhost:8080/user/1
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }


    //get user data by id
    //GET - http://localhost:8080/user/1
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }


}