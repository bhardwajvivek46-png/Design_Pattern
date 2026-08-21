package com.data_intigration_layers.repository.springdata;

import com.data_intigration_layers.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataEmployeeRepo extends JpaRepository<Employee, Long> {

        Employee findByNameAndDepartment(String name, String department);
}
