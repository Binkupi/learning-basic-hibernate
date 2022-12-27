package com.demo.test.hibernate.services;

import com.demo.test.hibernate.daos.BillDetailRepository;
import com.demo.test.hibernate.daos.WatchRepository;
import com.demo.test.hibernate.models.BillDetailModel;
import com.demo.test.hibernate.models.WatchModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchService {
    @Autowired
    private WatchRepository watchRepository;

    public List<WatchModel> findAll(){
        return watchRepository.findAll();
    }
}
