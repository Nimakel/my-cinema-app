package com.cinema.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import com.cinema.model.Role;
import com.cinema.model.User;
import com.cinema.service.RoleService;
import com.cinema.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private UserService userService;
    private RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        Role userRole = new Role();

        adminRole.setRoleName(Role.RoleName.ADMIN);
        userRole.setRoleName(Role.RoleName.USER);

        roleService.add(adminRole);
        roleService.add(userRole);

        User superUser = new User();

        superUser.setEmail("admin@admin.su");
        superUser.setPassword("qwerty123");
        superUser.setRoles(Set.of(adminRole));

        userService.add(superUser);
    }
}
