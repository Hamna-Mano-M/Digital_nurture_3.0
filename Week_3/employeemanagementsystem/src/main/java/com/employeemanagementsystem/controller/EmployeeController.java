package com.employeemanagementsystem.controller;

import com.employeemanagementsystem.entity.Employee;
import com.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.employeemanagementsystem.projection.EmployeeNameEmailProjection;
import com.employeemanagementsystem.projection.EmployeeDetailsProjection;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/paginated")
    public Page<Employee> getPaginatedEmployees(Pageable pageable) {
    return employeeService.getEmployees(pageable);

    }
    @GetMapping("/paginated-sorted")
    public Page<Employee> getPaginatedAndSortedEmployees(Pageable pageable) {
    return employeeService.getEmployees(pageable);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            Employee updatedEmployee = employee.get();
            updatedEmployee.setName(employeeDetails.getName());
            updatedEmployee.setEmail(employeeDetails.getEmail());
            updatedEmployee.setDepartment(employeeDetails.getDepartment());
            return ResponseEntity.ok(employeeService.updateEmployee(updatedEmployee));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            employeeService.deleteEmployee(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/employees/names-emails")
    public List<EmployeeNameEmailProjection> getEmployeeNamesAndEmails() {
    return employeeService.getAllEmployeeNamesAndEmails();
    }

    @GetMapping("/employees/details")
public List<EmployeeDetailsProjection> getEmployeeDetailsByDepartment(@RequestParam String departmentName) {
    return employeeService.getEmployeeDetailsByDepartmentName(departmentName);
}

    
}
