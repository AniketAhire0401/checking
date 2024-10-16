package com.example.EmProject.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Document(value = "empCollection")
public class Employee {
    @Id
    private String id;
    private String Name;
    private String Phone;
    private String Email;
}
