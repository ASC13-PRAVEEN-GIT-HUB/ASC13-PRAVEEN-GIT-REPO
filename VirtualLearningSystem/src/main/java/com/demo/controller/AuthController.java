package com.demo.controller;


import com.demo.entity.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> loginData) {
        Map<String, String> response = new HashMap<>();

        String username = loginData.get("username");
        String password = loginData.get("password");

        User user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            response.put("status", "valid");
            response.put("message", "Login successful");
        } else {
            response.put("status", "invalid");
            response.put("message", "Invalid credentials");
        }

        return response;
    }


    @PostMapping("/register")
    public Map<String, String> register(@RequestBody Map<String, String> userData) {
        Map<String, String> response = new HashMap<>();

        String username = userData.get("username");
        String password = userData.get("password");

        if (userRepository.findByUsername(username) != null) {
            response.put("status", "exists");
            response.put("message", "Username already exists");
            return response;
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);

        response.put("status", "created");
        response.put("message", "User created successfully");
        return response;
    }
}

