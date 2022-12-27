package com.demo.test.hibernate.controllers;

import com.demo.test.hibernate.models.BillModel;
import com.demo.test.hibernate.services.BillService;
import com.demo.test.hibernate.services.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/function")
public class FunctionController {

    @Autowired
    private FunctionService functionService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> home() throws Exception {
        List<String> bills = functionService.convertIntListToString();
        return ResponseEntity.ok(bills);
    }
}
