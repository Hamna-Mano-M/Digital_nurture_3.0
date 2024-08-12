package com.employeemanagementsystem.entity;



import lombok.Data;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;
    @SuppressWarnings("deprecation")
    @Entity
    @EntityListeners(AuditingEntityListener.class)
    @DynamicUpdate // Generates SQL for update operations based only on changed columns
    @Where(clause = "active = true") // Filter entities based on condition
    @Table(name = "employees")
    @Data
    @NamedQueries({
    @NamedQuery(
        name = "Employee.findByDepartmentName",
        query = "SELECT e FROM Employee e WHERE e.department.name = :departmentName"
    )
})

    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    
        private String name;
        private String email;
        private boolean active = true; 
    
        @ManyToOne
        @JoinColumn(name = "department_id")
        private Department department;


        @CreatedBy
        private String createdBy;
    
        @LastModifiedBy
        private String lastModifiedBy;
    
        @CreatedDate
        private LocalDateTime createdDate;
    
        @LastModifiedDate
        private LocalDateTime lastModifiedDate;



    
    

        
}

