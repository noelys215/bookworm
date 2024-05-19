package com.example.bookwormbase.backend.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



public class PasswordGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String adminHash = encoder.encode("DowJonesTopSecretPassword");
        String user1Hash = encoder.encode("SomeSecretPassword");
        System.out.println("Admin password hash: " + adminHash);
        System.out.println("User1 password hash: " + user1Hash);
    }
}


