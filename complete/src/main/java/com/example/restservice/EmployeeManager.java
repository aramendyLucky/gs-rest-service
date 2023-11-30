package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static Employees initializeEmployees() {
        Employees employees = new Employees();
        List<Employee> exampleEmployees = new ArrayList<>();

        // Insertar 3-4 ejemplos de empleados
        exampleEmployees.add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        exampleEmployees.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        exampleEmployees.add(new Employee(3, "Bob", "Johnson", "bob.johnson@example.com", "QA Analyst"));
        // Agrega más ejemplos según sea necesario

        employees.setEmployeeList(exampleEmployees);
        return employees;
    }
}
