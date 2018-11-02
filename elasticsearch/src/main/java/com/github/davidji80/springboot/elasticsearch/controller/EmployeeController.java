package com.github.davidji80.springboot.elasticsearch.controller;

import com.github.davidji80.springboot.elasticsearch.dao.EmployeeRepository;
import com.github.davidji80.springboot.elasticsearch.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("es")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("add")
    public String add() {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setFirstName("ji");
        employee.setLastName("zhou");
        employee.setAge(26);
        employee.setAbout("i am in shanghai");
        employeeRepository.save(employee);
        return "success";
    }

    @RequestMapping("delete")
    public String delete() {
        Employee employee = employeeRepository.queryEmployeeById("1");
        employeeRepository.delete(employee);
        return "success";
    }

    @RequestMapping("update")
    public String update() {
        Employee employee = employeeRepository.queryEmployeeById("1");
        employee.setFirstName("季");
        employeeRepository.save(employee);
        return "success";
    }

    @RequestMapping("query")
    public Employee query() {
        Employee accountInfo = employeeRepository.queryEmployeeById("1");
        return accountInfo;
    }

}
