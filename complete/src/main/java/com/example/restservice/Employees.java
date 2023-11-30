package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // Constructor
    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    // Getter
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // Setter
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
