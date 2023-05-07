package com.cinema.dao;

import java.util.Optional;
import com.cinema.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
