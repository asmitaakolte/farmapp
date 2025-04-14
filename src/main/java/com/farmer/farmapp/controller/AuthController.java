package com.farmer.farmapp.controller;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmer.farmapp.entity.User;
import com.farmer.farmapp.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3001") // Adjust for your frontend URL
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User loginUser) {
    User user = userRepository.findByUsername(loginUser.getUsername());

    if (user != null && user.getPassword().equals(loginUser.getPassword())) {
        return ResponseEntity.ok(user); // ✅ Return full user as JSON
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                             .body(Map.of("error", "Invalid username or password"));
    }
}

    

}
