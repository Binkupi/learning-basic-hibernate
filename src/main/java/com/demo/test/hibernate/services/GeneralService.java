package com.demo.test.hibernate.services;

import java.util.Optional;

public interface GeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

//    T save(T t);

    void remove(Long id);
}