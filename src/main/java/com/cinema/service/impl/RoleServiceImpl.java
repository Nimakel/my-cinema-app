package com.cinema.service.impl;

import com.cinema.dao.RoleDao;
import com.cinema.model.Role;
import com.cinema.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role roleName) {
        return roleDao.add(roleName);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(() ->
                new RuntimeException("Can't get this role: " + roleName));
    }
}
