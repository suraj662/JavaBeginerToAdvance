package com.example.demo;

//Service Layer + Dependency Injection
import com.example.demo.UserService;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    public String createUsers(User user) {
//        return "User created: " + user.getName() + ", Age: " + user.getAge();
//    }

    //pass only name
    public String createUsers(User user) {
        return "Saved user: " + user.getName().toUpperCase();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User newUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setAge(newUser.getAge());
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public String deleteUser(Long id) {
        if(!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        else userRepository.deleteById(id);

        return "User deleted successfully";
    }

    //gey user by id
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

}
