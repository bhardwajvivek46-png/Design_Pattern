package com.data_intigration_layers.service.jpa;

import com.data_intigration_layers.entity.Employee;
import com.data_intigration_layers.repository.jpa.JpaEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaEmployeeService {

    @Autowired
    private JpaEmployeeRepo jpaEmployeeRepo;

    public Employee findByNameAndDepartment(String name, String department){
        return jpaEmployeeRepo.findByNameAndDepartment(name, department);
    }
}
