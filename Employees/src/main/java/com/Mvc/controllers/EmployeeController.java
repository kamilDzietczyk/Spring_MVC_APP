package com.Mvc.controllers;

import com.Mvc.API.Employee;
import com.Mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/showEmployee")
    public String showEmployee(Model model) {
        List<Employee>employeeList = employeeService.loadEmployee();
        model.addAttribute("employee",employeeList);
        return "EmployeeList";
    }

    @GetMapping("/showAddEmployeePage")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("empl",employee);
        return "EmployeeAdd";
    }

    @PostMapping("/SaveEmploye")
    public String addEmployee(Employee employee){
        /*if (employee.getId() == 0 ){

        }else {
            employeeService.updateEmployee(employee);
            System.out.println("Rows Update");
        }*/

        List<Employee>employeeList = employeeService.loadEmployee();
        int counter= 0;
        String redict="";
        for(Employee e :employeeList){
            if(e.getPesel().equals(employee.getPesel()))
            {
                counter++;
            }
        }

        if (employee.getId() == 0 && counter<=0 ){
            employeeService.saveEmploye(employee);
            redict = "redirect:/showEmployee";
        }else if (employee.getId() == 0 && counter>0){
            redict = "redirect:/ErrorAddUser";
        }else if(employee.getId() != 0 && counter>0) {
            employeeService.updateEmployee(employee);
            redict = "redirect:/showEmployee";
        }
        return redict;
    }

    @GetMapping("/update")
    public String updateEmployee(@RequestParam("userId") int id,Model model){
        Employee TheEmploye = employeeService.getEmployee(id);
        model.addAttribute("empl",TheEmploye);
        return "EmployeeAdd";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("userId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/showEmployee";
    }


}