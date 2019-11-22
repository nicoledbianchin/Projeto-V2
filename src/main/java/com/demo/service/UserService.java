package com.demo.service;

import com.demo.domain.User;
import com.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> getAll() {

        return StreamSupport
                .stream(userRepository.findAll().spliterator(), Boolean.FALSE)
                .collect(Collectors.toList());
    }
}
