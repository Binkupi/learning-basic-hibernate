package com.demo.test.hibernate.services;

import com.demo.test.hibernate.daos.BillDetailRepository;
import com.demo.test.hibernate.daos.BillRepository;
import com.demo.test.hibernate.models.BillDetailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDetailService {

    @Autowired
    private BillDetailRepository billDetailRepository;

    public List<BillDetailModel> findAll(){
        return billDetailRepository.findAll();
    }
}
