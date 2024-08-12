package com.employeemanagementsystem.repository;

import com.employeemanagementsystem.entity.Employee;
import com.employeemanagementsystem.projection.EmployeeDetailsProjection;
import com.employeemanagementsystem.projection.EmployeeNameEmailProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    List<Employee> findByDepartmentId(Long departmentId);

    // Derived query method to find an employee by email
    Employee findByEmail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email LIKE %:domain")

        List<Employee> findByEmailDomain(@Param("domain") String domain);
    @Query(name = "Employee.findByDepartmentName")

        List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);

    List<EmployeeNameEmailProjection> findAllProjectedBy();

    @Query("SELECT new com.example.employeemanagementsystem.projection.EmployeeDetailsProjection(e.name, e.email, e.department.name) " +
           "FROM Employee e WHERE e.department.name = :departmentName")
        List<EmployeeDetailsProjection> findEmployeeDetailsByDepartmentName(@Param("departmentName") String departmentName);

        @Modifying
        @Query("UPDATE Employee e SET e.active = :status WHERE e.id = :employeeId")
        void updateStatus(@Param("employeeId") Long employeeId, @Param("status") boolean status);
    
}

    


    
