package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PreAuthorize("hasRole('EMPLOYEE') or hasRole('ADMIN')")
    public Page<Employee> listEmployees(int page, int size, String sortBy, String sortDir) {
        return employeeService.listEmployees(page, size, sortBy, sortDir);
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Employee getEmployeeById(Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Employee addEmployee(Long id, String name, int age, String employeeClass, String subjects, int attendance) {
        Employee employee = new Employee(id, name, age, employeeClass, subjects, attendance);
        return employeeService.addEmployee(employee);
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Employee updateEmployee(Long id, String name, Integer age, String employeeClass, String subjects, Integer attendance) {
        Employee updatedEmployee = new Employee(id, name, age, employeeClass, subjects, attendance);
        return employeeService.updateEmployee(id, updatedEmployee);
    }
}
