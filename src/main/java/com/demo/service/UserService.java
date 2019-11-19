package com.demo.service;

import com.demo.domain.User;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    private List<User> findAll(){
        return (List<User>) repository.findAll();
    }

    private List<User> findByName(String name){
        return repository.findByName(name);
    }

    private User findById(long id){
        return repository.findById(id);
    }
}
