package com.cinema.service;

import com.cinema.model.Role;

public interface RoleService {
    Role add(Role roleName);

    Role getByName(String roleName);
}
