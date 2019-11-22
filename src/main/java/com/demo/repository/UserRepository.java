package com.demo.repository;

import com.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

    List<User> findByName(String name);

     User findById(long id);

}
