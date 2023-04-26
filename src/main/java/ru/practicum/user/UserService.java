package ru.practicum.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
}