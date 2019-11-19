package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService service;

    public UserController(UserService service){
        this.service = service;
    }

}
