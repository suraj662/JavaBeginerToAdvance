package com.example.webapp.controller;

import com.example.webapp.dto.UserRequestDTO;
import com.example.webapp.dto.UserResponseDTO;
import com.example.webapp.model.User;
import com.example.webapp.repository.UserRepository;
import com.example.webapp.response.ApiResponse;
import com.example.webapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService ) {

        this.userService = userService;
    }

//    @PostMapping
//    public ApiResponse<User> createUser(@Valid @RequestBody User user){
//        User saved = userService.createUser(user);
//        return new ApiResponse<>(true , user , "user created sucessfully");
//    }

    //or with dto validation
    //POST http://localhost:8080/user
    @PostMapping
    public UserResponseDTO createUser(@Valid @RequestBody UserRequestDTO dto){
        return userService.createUser(dto);
    }

    //GET http://localhost:8080/user
    @GetMapping
    public ApiResponse<List<User>> getAllUsers(){
        List<User> user = userService.getAllUsers();
        return new ApiResponse<>(true , user , "user fetched successfully");
    }


    // delete by email
    //DELETE http://localhost:8080/user/email/test@gmail.com
    @DeleteMapping("/email/{email}")
    public String deleteByEmail(
            @PathVariable String email
    ) {
        return userService.deleteByEmail(email);
    }

    //update by email
    //PUT http://localhost:8080/user/email/test@gmail.com
    @PutMapping("/email/{email}")
    public User updateByEmail(
            @PathVariable String email,
            @RequestBody User user
    ) {
        return userService.updateByEmail(email, user);
    }

    //delete all user
    //DELETE http://localhost:8080/user/all
    @DeleteMapping("/all")
    public String deleteAllUsers() {
        return userService.deleteAllUsers();
    }


    @GetMapping("/profile")
    public String profile() {

        return "User Profile";
    }

}
