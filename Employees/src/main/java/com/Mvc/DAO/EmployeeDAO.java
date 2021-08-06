package com.Mvc.DAO;
import com.Mvc.API.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> loadEmployee();
    void saveEmploye(Employee employee);
    Employee getStudent(int id);
    void udeate(Employee employee);

    void deleteEmployee(int id);
}
