package com.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger()

	public static void main(String[] args) {

		SpringApplication.run(Accessing);
	}
}
