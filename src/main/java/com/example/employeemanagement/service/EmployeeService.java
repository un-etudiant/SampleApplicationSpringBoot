package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service

public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
     }

    public Optional<Employee> getEmployeeById(Long id) {
       return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
       return employeeRepository.save(employee);

    }

    public void deleteEmployee(Long id) {

       employeeRepository.deleteById(id);
    }
//    private boolean isDevProfile() {
//        return Arrays.asList(env.getActiveProfiles()).contains("dev");
//    }
}
