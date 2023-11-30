package com.example.restservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final Employees employees;  // Asegúrate de tener una referencia a la clase Employees

    // Constructor
    public EmployeeController(Employees employees) {
        this.employees = employees;
    }

    // Endpoint para obtener todos los datos de usuario
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees.getEmployeeList();
    }
}
