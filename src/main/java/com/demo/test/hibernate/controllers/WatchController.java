package com.demo.test.hibernate.controllers;

import com.demo.test.hibernate.models.BillDetailModel;
import com.demo.test.hibernate.models.WatchModel;
import com.demo.test.hibernate.services.BillDetailService;
import com.demo.test.hibernate.services.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/watch")
public class WatchController {

    @Autowired
    private WatchService watchService;

    @RequestMapping(value = "/get-all", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> getAll() throws Exception {
        List<WatchModel> bills = watchService.findAll();
        return ResponseEntity.ok(bills);
    }
}
