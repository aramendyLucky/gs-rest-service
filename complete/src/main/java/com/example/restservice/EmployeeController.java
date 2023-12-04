package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    // Endpoint para obtener la lista de empleados
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeManager.getAllEmployees();
    }

    // Endpoint para agregar un nuevo empleado mediante una solicitud POST
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        // Agregar lógica para validar y guardar el nuevo empleado
        return employeeManager.addEmployee(employee);
    }
}
