package com.example.userservice.service;

import com.example.userservice.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User product);
    List<User> getUsers();

    User getUserById(int id);
    String deleteUser(int id);
}
