package com.data_intigration_layers.repository.hibernate;

import com.data_intigration_layers.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateEmployeeRepo {

    @Autowired
    private SessionFactory sessionFactory;

    public Employee findByNameAndDepartment(String name, String department){
        try(Session session = sessionFactory.openSession()){
            String hql = "FROM Employee WHERE name = :name and department = :department ";
            return session.createQuery(hql, Employee.class)
                    .setParameter("name", name)
                    .setParameter("department", department)
                    .uniqueResult();
        }
    }

}
