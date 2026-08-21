package com.data_intigration_layers.service.springdata;

import com.data_intigration_layers.entity.Employee;
import com.data_intigration_layers.repository.springdata.SpringDataEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringDataEmployeeService {

    @Autowired
    private SpringDataEmployeeRepo springDataEmployeeRepo;

    public Employee findByNameAndDepartment(String name, String department){
        return springDataEmployeeRepo.findByNameAndDepartment(name, department);
    }
}
