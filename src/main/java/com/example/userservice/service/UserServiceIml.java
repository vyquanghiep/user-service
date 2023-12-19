package com.example.userservice.service;

import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService{
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User product) {
        return userRepository.save(product);
    }


    public List<User> getUsers() {
        return userRepository.findAll();
    }


    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
    }


    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "Sản phẩm remove ||" + id;
    }
}
