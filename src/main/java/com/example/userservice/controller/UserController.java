package com.example.userservice.controller;

import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String ShowUser(Model model){
        List<User> listUsers =userService.getUsers();
        model.addAttribute("listUsers",listUsers);
        return " ";
    }
    @GetMapping("/add")
    public String AddUser(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "";
    }
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User product) {
        userService.saveUser(product);
        return "";

    }
    @GetMapping("/deleteSanpham/{id}")
    public String deleteUser(@PathVariable (value = "id") int id){
        userService.deleteUser(id);
        return "redirect:/listsp";
    }

}
