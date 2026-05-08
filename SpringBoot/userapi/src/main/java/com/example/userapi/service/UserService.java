package com.example.userapi.service;

import com.example.userapi.controller.UserController;
import com.example.userapi.dto.UserDTO;
import com.example.userapi.exception.ResourceNotFoundException;
import com.example.userapi.model.User;
import com.example.userapi.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;



import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    //logic to create new table one time only,
    //after that not usable again
    public User createUser(User user){
        return userRepository.save(user);
    }

    //get all user data,when this method called
    //public List<User> getAllUsers(){
    //    return userRepository.findAll();
    //}

    //get user data by Id
//    public Optional<User> getUserById(Long id) {
//        return userRepository.findById(id);
//    }

    //or
    // GET BY ID
    public UserDTO getUserById(Long id) {
        try {
            User user = userRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("User not found"));
            return modelMapper.map(user, UserDTO.class);
        }
        catch (Exception e) {
            logger.error("Error fetching user with id: {}", id, e);
            throw e;
        }
    }


    //update existing db data by id
    public User updateUser(Long id, User updatedUser) {

        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());

        return userRepository.save(existingUser);
    }

    //delete existing user data from db by id
    public void deleteUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        userRepository.delete(user);
    }


    //Pagination + Sorting
    //Pagination - Instead of everything, you fetch chunks (pages)
    //sorting - Sorting controls order of data
    //ex - Why Pagination + Sorting matters (REAL WORLD)
    //🛒 Example: E-commerce
    //Amazon doesn’t load all products at once
    //Uses:
    //pagination (page 1,2,3…)
    //sorting (price low → high)
    //👨‍💼 Example: Admin dashboard
    //View users 10 at a time
    //Sort by:
    //newest users
    //email
    //name
//    public Page<User> getAllUserPag(Pageable pageable) {
//        return userRepository.findAll(pageable);
//    }

    //or
    // GET ALL USERS WITH PAGINATION + DTO
    public Page<UserDTO> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable)
                .map(user -> modelMapper.map(user, UserDTO.class));
    }
}
