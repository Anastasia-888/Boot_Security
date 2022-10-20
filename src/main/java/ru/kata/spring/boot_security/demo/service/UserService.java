package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void add(User user);
    User getUserById(int id);
    void update(User newUser);
    void delete(User user);
    User getUserByName(String name);
}
