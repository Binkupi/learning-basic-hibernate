package com.demo.test.hibernate.daos;

import com.demo.test.hibernate.models.BillDetailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillDetailRepository extends JpaRepository<BillDetailModel, Integer> {
    public BillDetailModel findById(int id);
//    public List<BillDetailModel> find;
}
