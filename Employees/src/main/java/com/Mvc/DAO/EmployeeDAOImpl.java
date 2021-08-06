package com.Mvc.DAO;

import com.Mvc.API.Employee;
import com.Mvc.rowmapper.EmployeeRowmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> loadEmployee() {
        String sql = "SELECT * FROM employees;";
        List<Employee> employeeList = jdbcTemplate.query(sql, new EmployeeRowmapper());
        return employeeList;
    }

    @Override
    public void saveEmploye(Employee employee) {
        Object[] PqramSQL = {employee.getName(),employee.getMobile(),employee.getCountry(),employee.getPesel()};
        String sql = "INSERT INTO employees(name,mobile,country, Pesel) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql,PqramSQL);
        System.out.println("Employee added");
    }

    @Override
    public Employee getStudent(int id) {
        String sql = "Select * From employees where id = ?";
        Employee employee = jdbcTemplate.queryForObject(sql,new EmployeeRowmapper(),id);
        return employee;
    }

    @Override
    public void udeate(Employee employee) {
        String sql = "UPDATE employees SET name = ?, mobile = ?, country = ?, Pesel =? Where id = ?;";
        Object[] parameters = {employee.getName(),employee.getMobile(),employee.getCountry(),employee.getPesel(),employee.getId()};
        jdbcTemplate.update(sql,parameters);
    }

    @Override
    public void deleteEmployee(int id) {
        String sql = "Delete from employees Where id = ?";
        jdbcTemplate.update(sql,id);
    }


}
