package com.demo.test.hibernate.controllers;

import com.demo.test.hibernate.services.HandleFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/handle-file")
public class HandleFIleController {

    @Autowired
    HandleFileService handleFileService;

    @RequestMapping(value = "/read", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> read() throws Exception {
        String result = handleFileService.readFile();
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "/write", method = RequestMethod.GET, consumes = "application/json", produces = "application/json; charset=utf-8")
    public ResponseEntity<Object> write() throws Exception {
        handleFileService.writeFile();
        return ResponseEntity.ok("success");
    }

}
