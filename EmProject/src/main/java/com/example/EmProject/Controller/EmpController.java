package com.example.EmProject.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.EmProject.Interfaces.IEmpService;
import com.example.EmProject.Model.Employee;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/employee-controller")
public class EmpController
{

    private final IEmpService empService;
    EmpController(IEmpService empService)
    {
        this.empService=empService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() 
    {
        return empService.getAllEmployees();
    }

    @GetMapping("/employees/get-employee-by-id")
    public Employee getEmployeeById(@RequestParam String empId)
    {
        return empService.getEmployeeById(empId);
    }

    @PostMapping("/employees/add-employee")
    public String createEmployees(@RequestBody  Employee employee)
    {
        return empService.createEmployee(employee);
    }

    @DeleteMapping("/employees/delete-employee-by-id")
    public String deleteEmployeebyid(@RequestParam String empId)
    {
        return empService.deleteEmployeebyid(empId);
    }
    
    @PutMapping("/employees/update-employee-by-id/{empId}")
    public String updateEmployeebyid(@PathVariable String empId, @RequestBody Employee updatedEmployee) {
        
        return empService.updateEmployeebyid(empId,updatedEmployee);
    }
    
    
}
