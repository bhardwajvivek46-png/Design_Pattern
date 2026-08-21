package com.data_intigration_layers.service.hibernate;

import com.data_intigration_layers.entity.Employee;
import com.data_intigration_layers.repository.hibernate.HibernateEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateEmployeeService {

    @Autowired
    private HibernateEmployeeRepo hibernateEmployeeRepo;

    public Employee findByNameAndDepartment(String name, String department){
        return hibernateEmployeeRepo.findByNameAndDepartment(name, department);
    }
}
