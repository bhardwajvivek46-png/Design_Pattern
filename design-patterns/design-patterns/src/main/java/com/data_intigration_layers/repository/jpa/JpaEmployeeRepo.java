package com.data_intigration_layers.repository.jpa;

import com.data_intigration_layers.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class JpaEmployeeRepo {

    @PersistenceContext
    private EntityManager em;

    public Employee findByNameAndDepartment(String name, String department){
        String jpql = "FROM Employee WHERE name = :name AND department = :department";
        return em.createQuery(jpql, Employee.class)
                .setParameter("name", name)
                .setParameter("department", department)
                .getSingleResult();
    }

}
