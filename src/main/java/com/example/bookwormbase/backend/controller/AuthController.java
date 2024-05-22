package com.example.bookwormbase.backend.controller;

import com.example.bookwormbase.backend.models.User;
import com.example.bookwormbase.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        // Implement your authentication logic here
        String jwtToken = "test_token"; // Replace with actual token generation logic
        return ResponseEntity.ok(Collections.singletonMap("token", jwtToken));
    }
}

class LoginRequest {
    private String username;
    private String password;

    // Getters and setters
}

