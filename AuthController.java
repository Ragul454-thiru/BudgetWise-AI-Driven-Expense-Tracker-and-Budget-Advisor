package com.budgetwise.controller;

import com.budgetwise.model.User;
import com.budgetwise.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserRepository repo;

    public AuthController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return repo.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return repo.findByEmail(user.getEmail());
    }
}
