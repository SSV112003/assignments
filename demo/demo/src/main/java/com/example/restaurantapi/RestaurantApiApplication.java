package com.example.restaurantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.example.restaurantapi")
@EntityScan("com.example.restaurantapi")
@ComponentScan("com.example.restaurantapi")

public class RestaurantApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantApiApplication.class, args);
    }
}
//http://localhost:8099/h2-console
//Username: sa

//Password: (leave it blank)

