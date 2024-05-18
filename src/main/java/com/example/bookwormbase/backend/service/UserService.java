package com.example.bookwormbase.backend.service;

import com.example.bookwormbase.backend.models.User;
import com.example.bookwormbase.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    //Other crud ops.
}
