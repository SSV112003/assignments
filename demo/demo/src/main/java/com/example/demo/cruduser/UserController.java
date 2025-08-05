package com.example.demo.cruduser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/SpringBootRestApi/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUser(@PathVariable Long id) {
        Optional<User> user = service.getUserById(id);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            Map<String, String> error = new HashMap<>();
            error.put("errorMessage", "User with id " + id + " not found");
            return ResponseEntity.status(404).body(error);
        }
    }


    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable Long id, @RequestBody User newUser) {
        Optional<User> optionalUser = service.getUserById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(newUser.getName());
            user.setAge(newUser.getAge());
            user.setSalary(newUser.getSalary());
            service.saveUser(user);
            return ResponseEntity.ok(user);
        } else {
            Map<String, String> error = new HashMap<>();
            error.put("errorMessage", "User with id " + id + " not found");
            return ResponseEntity.status(404).body(error);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
