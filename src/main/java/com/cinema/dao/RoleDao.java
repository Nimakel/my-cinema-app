package com.cinema.dao;

import java.util.Optional;
import com.cinema.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
