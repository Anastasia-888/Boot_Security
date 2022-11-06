package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.UserDao;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.List;

import static java.util.Objects.isNull;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userRepository;

    public UserServiceImpl(UserDao userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    @Transactional
    public void update(User newUser, int id) {
        userRepository.update(newUser, id);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public User getUserByName(String name) {
        return userRepository.getUserByName(name);
    }

}
