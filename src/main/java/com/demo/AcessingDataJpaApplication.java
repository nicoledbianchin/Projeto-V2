package com.demo;

import com.demo.domain.User;
import com.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AcessingDataJpaApplication {

    public static void main(String[] args) {

        SpringApplication.run(AcessingDataJpaApplication.class, args);
    }
}
