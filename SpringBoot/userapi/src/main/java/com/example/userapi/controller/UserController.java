package com.example.userapi.controller;

import com.example.userapi.dto.UserDTO;
import com.example.userapi.exception.ResourceNotFoundException;
import com.example.userapi.model.User;
import com.example.userapi.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

//1. When user IS FOUND
//Client (Postman)
//        ↓
//Controller
//        ↓
//Service
//        ↓
//Repository (JPA)
//        ↓
//Database (PostgreSQL)
//        ↓
//User Found ✅
//        ↓
//Return User Object
//        ↓
//Controller sends JSON response

@RestController
@RequestMapping("/users")   // base URL
@Tag(name = "User API", description = "Operations related to users")   //swagger UI
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    //create user
    //requests to create data in db
    //POST http://localhost:8080/users
    @Operation(summary = "Create new user")   //swagger UI
    @PostMapping
    public User createUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }
    //requests to display all users data
    //GET http://localhost:8080/users
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }

    // GET BY ID
    //requests to get user data by id
    //GET http://localhost:8080/users/1
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id) {
//        return userService.getUserById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
//    }

    //or with dto
    @Operation(summary = "Get user by ID")  //swagger UI
    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
            return userService.getUserById(id);
    }




    //requests to update existing user db data
    //PUT http://localhost:8080/users/1
    //ex -
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @Valid @RequestBody User user) {
        return userService.updateUser(id, user);
    }


    //requests to delete existing data
    //DELETE http://localhost:8080/users/1
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }


    //requests to sending data in chunks(Pagination logic) + sorting logic
    //Pagination only - GET http://localhost:8080/users?page=0&size=3
    //Pagination + Sorting - GET http://localhost:8080/users?page=0&size=3&sort=name,asc
    //Multiple sorting - GET http://localhost:8080/users?sort=name,asc&sort=id,desc
//    @GetMapping
//    public Page<User> getAllUserPag(Pageable pageable) {
//        return userService.getAllUserPag(pageable);
//    }

    //or

    //Pagination + sorting with dto
    @Operation(summary = "Get all users with pagination and sorting")   //swagger UI
    @GetMapping
    public Page<UserDTO> getAllUsers(Pageable pageable) {
        logger.info("Fetching all users");
        return userService.getAllUsers(pageable);
    }
}

//Swagger UI -OpenAPI

//http://localhost:8080/swagger-ui/index.html
//🎉 You will see:
//All endpoints listed
//Expandable APIs
//“Try it out” button

//to create api docs --
//http://localhost:8080/v3/api-docs