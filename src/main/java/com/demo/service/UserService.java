package com.demo.service;

import com.demo.domain.User;
import com.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    private List<User> findAll(UserRepository r){
        return (List<User>) userRepository.findAll();
    }

    private List<User> findByName(String name){
        return userRepository.findByName(name);
    }

    private User findById(long id){
        return userRepository.findById(id);
    }
}
