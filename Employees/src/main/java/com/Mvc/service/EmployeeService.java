package com.Mvc.service;

import com.Mvc.API.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> loadEmployee();

    void saveEmploye(Employee employee);

    Employee getEmployee(int id);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);
}
