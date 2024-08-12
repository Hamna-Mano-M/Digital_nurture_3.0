package com.employeemanagementsystem.service;

import com.employeemanagementsystem.entity.Employee;
import com.employeemanagementsystem.projection.EmployeeDetailsProjection;
import com.employeemanagementsystem.projection.EmployeeNameEmailProjection;
import com.employeemanagementsystem.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public Page<Employee> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    public List<EmployeeDetailsProjection> getEmployeeDetailsByDepartmentName(String departmentName) {
        return employeeRepository.findEmployeeDetailsByDepartmentName(departmentName);
    }

    public List<EmployeeNameEmailProjection> getAllEmployeeNamesAndEmails() {
        return employeeRepository.findAllProjectedBy();
    }


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public void saveEmployees(List<Employee> employees) {
        int batchSize = 20; // Define batch size
        for (int i = 0; i < employees.size(); i++) {
            employeeRepository.save(employees.get(i));
            if (i % batchSize == 0 && i > 0) {
                employeeRepository.flush(); // Flush the session to execute batch
            }
        }
        employeeRepository.flush(); // Ensure all entities are saved
    }

    
    
}
