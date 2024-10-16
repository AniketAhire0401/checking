package com.example.EmProject.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.EmProject.Interfaces.IEmpService;
import com.example.EmProject.Model.Employee;
import com.example.EmProject.Repository.EmpRepository;

// these is service
// iam inside dev
@Service
public class EmpService implements IEmpService{
List<Employee> employees = new ArrayList<>();
private final EmpRepository empRepository;

EmpService(EmpRepository empRepository){
    this.empRepository=empRepository;
}

    public List<Employee> getAllEmployees() 
    {
       return empRepository.findAll();
    }

    public String createEmployee(Employee employee)
    {
         empRepository.save(employee);
        return "Saved Successfully";
    }

    public String deleteEmployeebyid(String empId) 
    {
        Employee employee = empRepository.findById(empId).orElse(null); // Retrieve the employee by ID from MongoDB
       
        if (employee != null) 
        {
            empRepository.delete(employee);  // Delete the employee
            return "Employee with ID " + empId + " has been deleted.";
        }
        return "Employee with ID " + empId + " not found, deletion failed.";
    }
    

    public Employee getEmployeeById(String empId) 
    {
        return empRepository.findById(empId).orElse(null); 
    }

    public String updateEmployeebyid(String empId, Employee updatedEmployee)
    {
        Employee employee = empRepository.findById(empId).orElse(null); 
        if (employee != null) {
        
            employee.setName(updatedEmployee.getName());
            employee.setPhone(updatedEmployee.getPhone());
            employee.setEmail(updatedEmployee.getEmail());
    
            empRepository.save(employee);  
            return "Employee with ID " + empId + " has been updated successfully!";
        }
        return "Employee with ID " + empId + " not found!";
    }
    

}
