package ar.com.fullbackend.dao.impl;

import ar.com.fullbackend.dto.Employee;

/**
 * Created by computer on 20/03/17.
 */
public class TestEmployee {

    public static void main(String args[]){
        Employee em = new Employee();
        em.setId(1);
        em.setFirstName("Gonzalo");
        em.setLastName("Garay");
        em.setSalary(10000);

        EmployeeDAO.create(em);


    }
}
