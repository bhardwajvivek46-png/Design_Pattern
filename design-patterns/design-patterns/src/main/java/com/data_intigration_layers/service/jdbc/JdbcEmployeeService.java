package com.data_intigration_layers.service.jdbc;

import com.data_intigration_layers.entity.Employee;
import com.data_intigration_layers.repository.jdbc.JdbcEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JdbcEmployeeService {

    @Autowired
    private JdbcEmployeeRepo jdbcEmployeeRepo;

    public Employee findByNameAndDepartment(String name, String department){
        return jdbcEmployeeRepo.findByNameAndDepartment(name, department);
    }
}
