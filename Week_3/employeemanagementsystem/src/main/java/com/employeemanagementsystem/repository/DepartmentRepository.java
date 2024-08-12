package com.employeemanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employeemanagementsystem.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    
    
    @Query("SELECT d FROM Department d WHERE SIZE(d.employees) = :count")
    List<Department> findByEmployeeCount(@Param("count") int count);
    @Query(name = "Department.findByName")
    List<Department> findByName(@Param("name") String name);


}
