package com.lizhiboxue.location.controller;

import com.lizhiboxue.location.entity.User;
import com.lizhiboxue.location.repo.UserRepo;
import com.lizhiboxue.location.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    IUserService userService;

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable String id) {
        return userRepo.findById(id);
    }

    @PostMapping("add")
    public User add(User user) {
        return userRepo.save(user);
    }

}
