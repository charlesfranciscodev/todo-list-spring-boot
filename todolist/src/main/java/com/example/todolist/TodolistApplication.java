package com.example.todolist;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(TodolistApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
        LOGGER.info("HELLO WORLD");
    }
}
