package com.farmer.farmapp.controller;

import com.farmer.farmapp.entity.User;
import com.farmer.farmapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3001")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers(@RequestParam(required = false) String exclude) {
        List<User> users = userRepository.findAll();
        if (exclude != null) {
            users.removeIf(user -> user.getUsername().equalsIgnoreCase(exclude));
        }
        return users;
    }
}
