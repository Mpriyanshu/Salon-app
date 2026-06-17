package com.rancho.controller;

import com.rancho.modal.User;
import com.rancho.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/api/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PutMapping("/api/users/1")
    public User updateUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
