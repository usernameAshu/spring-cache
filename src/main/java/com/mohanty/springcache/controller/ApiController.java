package com.mohanty.springcache.controller;

import com.mohanty.springcache.model.Student;
import com.mohanty.springcache.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class ApiController {

    @Autowired
    private ApiService service;

    @GetMapping(path = "/student")
    public ResponseEntity<Student> fetchStudent(@RequestParam("studentId") String studentId) {
        return new ResponseEntity<>(service.fetchStudent(studentId), HttpStatus.OK);
    }
}
