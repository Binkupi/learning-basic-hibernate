package com.demo.test.hibernate.controllers;

import com.demo.test.hibernate.daos.BillDAO;
import com.demo.test.hibernate.daos.BillDetailRepository;
import com.demo.test.hibernate.models.BillDetailModel;
import com.demo.test.hibernate.models.BillModel;
import com.demo.test.hibernate.models.ModelGroupBy;
import com.demo.test.hibernate.services.BillDetailService;
import com.demo.test.hibernate.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/bill-detail")
public class BillDetailController {

    @Autowired
    private BillDetailService billDetailService;

    @RequestMapping(value = "/get-all", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> getAll() throws Exception {
        List<BillDetailModel> bills = billDetailService.findAll();
        return ResponseEntity.ok(bills);
    }





}
