package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
  Employee findByEmail(String email);
//    List<Employee> findAll();
//    Optional<Employee> findById(Long id);
//    Employee save(Employee employee);
//    void deleteById(Long id);
}