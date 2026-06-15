package com.rancho.controller;

import com.rancho.modal.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

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
