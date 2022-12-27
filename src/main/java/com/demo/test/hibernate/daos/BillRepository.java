package com.demo.test.hibernate.daos;

import com.demo.test.hibernate.models.BillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<BillModel, Integer> {

//    public BillModel findById(int id);
//    public BillModel save(BillModel bill);

    public List<BillModel> findByDescriptionContaining(String des);
}
