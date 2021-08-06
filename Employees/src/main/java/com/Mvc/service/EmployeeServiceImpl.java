package com.Mvc.service;

import com.Mvc.API.Employee;
import com.Mvc.DAO.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    public List<Employee> loadEmployee() {
        List<Employee> EmployeeList = employeeDAO.loadEmployee();
        return EmployeeList;
    }

    @Override
    public void saveEmploye(Employee employee) {
        employeeDAO.saveEmploye(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeDAO.getStudent(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDAO.udeate(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }


}
