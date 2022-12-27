package com.demo.test.hibernate.daos;

import com.demo.test.hibernate.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
