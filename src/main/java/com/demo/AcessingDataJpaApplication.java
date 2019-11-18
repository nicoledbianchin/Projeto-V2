package com.demo;

import com.demo.domain.User;
import com.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class AcessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AcessingDataJpaApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(AcessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(UserRepository repository) {
        return (args) -> {
            repository.save(new User("user", "user@user.com", "password"));

            log.info("Usuários cadastrados:");
            for (User user : repository.findAll()) {
                log.info(user.toString());
            }
            log.info("");

            log.info("Usuário numero 1:");
            Optional<User> user = repository.findById(1L);
            log.info(user.toString());
            log.info("");

            log.info("Usuário com o nome user:");
            for (User user1 : repository.findByName("user")) {
				log.info(user1.toString());
			}
            log.info("");
        };
    }
}
