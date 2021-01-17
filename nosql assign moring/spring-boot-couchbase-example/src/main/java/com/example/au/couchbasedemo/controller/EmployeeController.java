package com.example.au.couchbasedemo.controller;

import java.util.List;
import java.util.Optional;

import com.example.au.couchbasedemo.model.Blogs;
import com.example.au.couchbasedemo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Employee;
import com.example.au.couchbasedemo.repository.EmployeeRepository;



// Sir I am new to spring-boot,Maven,etc and also we haven't been taught this yet
// So I tried all what I can understand from my knowledge , now as the submission
// date is getting close I am submitting this but later will improvise on this and show you.

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public Employee addEmployeePost(@RequestBody Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable String id) {
        if (employeeRepository.existsById(id)) {
            return employeeRepository.findById(id);
        } else
            return Optional.empty();
    }


    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeByLocation(@PathVariable String location, @PathVariable String id) {
        if (employeeRepository.existsById(id)) {
            return employeeRepository.findById(location);
        } else
            return Optional.empty();
    }






}