package ar.com.fullbackend.service;

import ar.com.fullbackend.dao.impl.EmployeeDAO;
import ar.com.fullbackend.dto.Employee;

import java.util.List;

/**
 * Created by computer on 20/03/17.
 */
public class EmployeeServiceImpl implements EmployeeService {

    public List<Employee> getEmployees(){
        return EmployeeDAO.read();
    }
}
