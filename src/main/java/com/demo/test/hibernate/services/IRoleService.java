package com.demo.test.hibernate.services;

import com.demo.test.hibernate.models.Role;

public interface IRoleService extends GeneralService<Role> {
    Role findByName(String name);
}
