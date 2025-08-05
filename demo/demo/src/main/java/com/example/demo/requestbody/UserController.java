package com.example.demo.requestbody;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody User user) {
        return "User received: " + user.getFirstName() + " " + user.getLastName() + ", Age: " + user.getAge();
    }
}

