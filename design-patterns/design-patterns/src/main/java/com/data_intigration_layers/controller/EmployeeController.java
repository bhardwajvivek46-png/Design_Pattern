package com.data_intigration_layers.controller;


import com.data_intigration_layers.entity.Employee;
import com.data_intigration_layers.service.hibernate.HibernateEmployeeService;
import com.data_intigration_layers.service.jdbc.JdbcEmployeeService;
import com.data_intigration_layers.service.jpa.JpaEmployeeService;
import com.data_intigration_layers.service.springdata.SpringDataEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private HibernateEmployeeService hibernateEmployeeService;
    @Autowired
    private JdbcEmployeeService jdbcEmployeeService;
    @Autowired
    private JpaEmployeeService jpaEmployeeService;
    @Autowired
    private SpringDataEmployeeService springDataEmployeeService;

    @GetMapping("/jdbc")
    public Employee getEmployeeViaJdbc(@RequestParam String name, @RequestParam String department){
        return jdbcEmployeeService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/hibernate")
    public Employee getEmployeeViaHibernate(@RequestParam String name, @RequestParam String department){
        return hibernateEmployeeService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/jpa")
    public Employee getEmployeeViaJpa(@RequestParam String name, @RequestParam String department){
        return jpaEmployeeService.findByNameAndDepartment(name, department);
    }

    @GetMapping("/spring-data-jpa")
    public Employee getEmployeeViaSpringDataJpa(@RequestParam String name, @RequestParam String department){
        return springDataEmployeeService.findByNameAndDepartment(name, department);
    }

}
