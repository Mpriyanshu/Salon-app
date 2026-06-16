package com.rancho.controller;

import com.rancho.modal.User;
import com.rancho.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/api/users")
    public User getUser(){
        User user = new User();
        user.setEmail("rancho@gmail.com");
        user.setFullName("code with rancho");
        user.setPhone("+91 12345678");// used string for country code
        user.setRole("Customer");
        return user;
    }
}
