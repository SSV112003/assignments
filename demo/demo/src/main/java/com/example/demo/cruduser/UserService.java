package com.example.demo.cruduser;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    private Map<Long, User> users = new HashMap<>();

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public User saveUser(User user) {
        users.put(user.getId(), user);
        return user;
    }

    public void deleteUser(Long id) {
        users.remove(id);
    }
}
