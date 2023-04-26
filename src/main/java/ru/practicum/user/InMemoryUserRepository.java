package ru.practicum.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryUserRepository implements UserRepository {

    private static List<User> users = new ArrayList<>();

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

}
