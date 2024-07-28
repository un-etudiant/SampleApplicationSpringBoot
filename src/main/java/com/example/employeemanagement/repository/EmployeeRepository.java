package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
//    List<Employee> findAll();
//    Optional<Employee> findById(Long id);
//    Employee save(Employee employee);
//    void deleteById(Long id);
}