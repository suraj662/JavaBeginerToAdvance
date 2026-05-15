package com.example.webapp.service;

import com.example.webapp.mapper.UserMapper;
import com.example.webapp.model.User;
import com.example.webapp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.webapp.dto.UserRequestDTO;
import com.example.webapp.dto.UserResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;


    public UserService(UserRepository userRepository
            ,UserMapper userMapper ,
                       PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    //create new user details
    //public User createUser(User user){
    //    return userRepository.save(user);
    //}

    //or after adding validation with dto layer
//    public UserResponseDTO createUser(UserRequestDTO dto) {
//
//        User user = userMapper.toEntity(dto);
//
//        User savedUser = userRepository.save(user);
//
//        return userMapper.toDTO(savedUser);
//    }

    //or, with password hashing(Encryption)
    @PostMapping
    public UserResponseDTO createUser(UserRequestDTO dto) {
        User user = userMapper.toEntity(dto);
        // encrypt password
        user.setPassword(
                passwordEncoder.encode(dto.getPassword())
        );
        User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }

    //get all user details
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    // delete by email
    public String deleteByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
        userRepository.delete(user);

        return "User deleted successfully";
    }

    //add update by email
    public User updateByEmail(String email, User updatedUser) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));
        user.setName(updatedUser.getName());
        user.setPassword(updatedUser.getPassword());

        return userRepository.save(user);
    }

    //delete all user
    public String deleteAllUsers() {
        userRepository.deleteAll();
        return "All users deleted successfully";
    }


}
