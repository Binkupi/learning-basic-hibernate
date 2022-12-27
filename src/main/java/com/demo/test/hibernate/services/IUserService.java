package com.demo.test.hibernate.services;

import com.demo.test.hibernate.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends GeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
