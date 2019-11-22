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

    public User save(User user){
        return userRepository.save(user);
    }

    private List<User> findAllUsers(UserRepository userRepository){
        return (List<User>) userRepository.findAll();
    }

    private List<User> findUserByName(String name){
        return userRepository.findByName(name);
    }

    private User findUserById(long id){
        return userRepository.findById(id);
    }

    private void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    public List<User> getAll() {
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), Boolean.FALSE)
                .collect(Collectors.toList());
    }
}
