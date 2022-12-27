package com.demo.test.hibernate.controllers;

import com.demo.test.hibernate.daos.BillDAO;
import com.demo.test.hibernate.daos.BillDetailRepository;
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
@RequestMapping("/api/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @Autowired
    private BillDetailService billDetailService;

    @RequestMapping(value = "/", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> home() throws Exception {
        List<BillModel> bills = billService.findByIdByQuery();
        return ResponseEntity.ok(bills);
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> findAll() throws Exception {
        List<BillModel> bills = billService.findAll();
        return ResponseEntity.ok(bills);
    }



    @RequestMapping(value = "/insert", method = RequestMethod.POST, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> insert(@RequestBody List<BillModel> request) throws Exception {
        billService.Insert(request);
        return ResponseEntity.ok(1);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> findById(@PathVariable("id") int id) throws Exception {
        BillModel bill = billService.findById(id);
        return ResponseEntity.ok(bill);
    }

    @RequestMapping(value = "/search/{desc}", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> searchDesc(@PathVariable("desc") String desc) throws Exception {
        List<BillModel> bills = billService.searchDesc(desc);
        return ResponseEntity.ok(bills);
    }

    @RequestMapping(value = "/test/groupBy", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> testGroupBy() throws Exception {
        Map<String,List<BillModel>> bills = billService.testGroupBy();
        return ResponseEntity.ok(bills);
    }

    @RequestMapping(value = "/test/groupByClass", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> testGroupByClass() throws Exception {
        Map<ModelGroupBy,List<BillModel>> bills = billService.testGroupByClass();
        return ResponseEntity.ok(bills);
    }

    @RequestMapping(value = "/test/groupBySum", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> testGroupBySum() throws Exception {
        Map<String, Integer> bills = billService.testGroupBySum();
        return ResponseEntity.ok(bills);
    }

    @RequestMapping(value = "/test/groupByChain", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> testGroupByChain() throws Exception {
        Map<String, Map<Integer,List<BillModel>>> bills = billService.testGroupByChain();
        return ResponseEntity.ok(bills);
    }

}
