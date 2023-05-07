package com.cinema.config;

import com.cinema.model.Role;
import com.cinema.model.User;
import com.cinema.service.RoleService;
import com.cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private UserService userService;
    private RoleService roleService;
    private User superUser;
    private User usualUser;
    private Role adminRole;
    private Role userRole;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        adminRole = new Role();
        userRole = new Role();
        superUser = new User();
        usualUser = new User();

        adminRole.setRoleName(Role.RoleName.ADMIN);
        userRole.setRoleName(Role.RoleName.USER);

        roleService.add(adminRole);
        roleService.add(userRole);

        superUser.setEmail("admin@admin.su");
        superUser.setPassword("qwerty123");
        superUser.setRoles(Set.of(adminRole));

        usualUser.setEmail("user@user.su");
        usualUser.setPassword("qwerty123");
        usualUser.setRoles(Set.of(userRole));

        userService.add(superUser);
        userService.add(usualUser);
    }
}
