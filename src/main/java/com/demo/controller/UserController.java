package com.demo.controller;

import com.demo.domain.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{name}")
    public List<User> findByName(@PathVariable("name") String name){
        return userService.findUserByName(name);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Long id){
        return userService.findUserById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
    }
}
