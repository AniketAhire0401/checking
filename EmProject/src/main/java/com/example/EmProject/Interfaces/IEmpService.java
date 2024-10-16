package com.example.EmProject.Interfaces;

import java.util.List;

import com.example.EmProject.Model.Employee;

public interface IEmpService
{

    List<Employee> getAllEmployees();

    String createEmployee(Employee employee);

    String deleteEmployeebyid(String id);

    Employee getEmployeeById(String empId);

    String updateEmployeebyid(String empId, Employee updatedEmployee);
    
}
