package com.rancho.service;

import com.rancho.modal.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
    User updateUser(Long id, User user);
}
