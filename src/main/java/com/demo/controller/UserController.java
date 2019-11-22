package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService service){
        this.userService = service;
    }

    @PostMapping("/saveUser")
    public void save(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok().body(userService.getAll());
    }
}
