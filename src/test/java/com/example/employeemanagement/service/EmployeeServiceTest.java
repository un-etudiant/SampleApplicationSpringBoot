package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {
    @InjectMocks
    
    private EmployeeService employeeService;
    @Mock
    private EmployeeRepository employeeRepository;
    
    
   

    @Test
    void getAllEmployees() {
        ArrayList<Employee> t = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setId(100L);
        e1.setFirstName("John");
        e1.setLastName("Doe");
        e1.setEmail("john@doe.com");
        t.add(e1);
        Mockito.when(employeeRepository.findAll()).thenReturn(t);
        List<Employee> allEmployees = employeeService.getAllEmployees();
        Mockito.verify(employeeRepository, Mockito.times(1)).findAll();
    }

    @Test
    void getEmployeeById() {
    }

    @Test
    void saveEmployee() {
    }

    @Test
    void deleteEmployee() {
    }
}