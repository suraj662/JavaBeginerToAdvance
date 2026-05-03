package com.example.demo;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//create rest API using @RestController = @Controller + @ResponseBody
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    //pass URL path
    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello world Spring boot";
    }

    //your API accept input from the URL.
    //http://localhost:8080/hello/suraj
    @GetMapping("/hello/{name}")
    public String sayHelloToUser(@PathVariable String name) {
        return "Hello " + name ;
    }

    //Query Parameters - to pass data using ?key=value
    //http://localhost:8080/greet?name=John - with value pass
    //http://localhost:8080/greet - no value pass
    @GetMapping("/greet")
    public String greetUser(@RequestParam(required = false) String name) {
        if (name == null) {
            name = "Guest";
        }
        return "Welcome, " + name;
    }

    //add method to pass as input in url
    //http://localhost:8080/add?a=5&b=3
    @GetMapping("/add")
    public int add(@RequestParam int a , int b){
        return a+b;
    }


    //create user
    //Send JSON data from client → backend, and convert it into a Java object.
    //http://localhost:8080/user
//    @PostMapping("/user")
//    public String createUser(@RequestBody User user){
//        return "User created: " + user.getName() + ", age: " + user.getAge();
//
//    }


    //http://localhost:8080/users
    @PostMapping("/users")
    public String createUsers(@RequestBody User user) {
        return userService.createUsers(user);
    }


    //create table in db,
    //ex - {
    //  "name": "John",
    //  "age": 25
    //}
    //http://localhost:8080/user
//    @PostMapping("/user")
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }

}
