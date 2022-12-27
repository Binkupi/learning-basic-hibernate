package com.demo.test.hibernate.daos;

import com.demo.test.hibernate.models.WatchModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends JpaRepository<WatchModel,Integer> {
}
