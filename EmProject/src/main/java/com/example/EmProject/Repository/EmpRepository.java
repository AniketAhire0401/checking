package com.example.EmProject.Repository;

import com.example.EmProject.Model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepository extends MongoRepository<Employee,String> 
{
}
