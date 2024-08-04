package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

@Slf4j
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        log.info(" Fetch by Employee Id {}", id);
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee) {
        if (employee.getEmail() == null) {
            log.error(" Cannot use NULL email");
            throw new UnsupportedOperationException("Cannot use NULL email");
        }
        Employee byEmail = employeeRepository.findByEmail(employee.getEmail());
        if (byEmail != null) {
            log.error("Employee with Email {} already exists", employee.getEmail());
            throw new UnsupportedOperationException("Employee with email " + employee.getEmail() + " already exists");
        }
        return employeeRepository.save(employee);

    }

    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);
    }
//    private boolean isDevProfile() {
//        return Arrays.asList(env.getActiveProfiles()).contains("dev");
//    }
}
