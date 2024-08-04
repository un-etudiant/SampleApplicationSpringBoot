package com.example.employeemanagement.controller;

import com.example.employeemanagement.client.EmployeeServiceClient;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")

@RequiredArgsConstructor()
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeServiceClient  employeeServiceClient;


    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/client")
    public void getEmployeeByTestId() {
         employeeServiceClient.test();
    }


    @GetMapping("/post")
    public void postEmployeeByTestId() {
        employeeServiceClient.post();
    }


    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
