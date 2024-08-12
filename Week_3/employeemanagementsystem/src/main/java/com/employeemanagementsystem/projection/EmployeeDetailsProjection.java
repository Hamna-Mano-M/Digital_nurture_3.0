package com.employeemanagementsystem.projection;

import org.springframework.beans.factory.annotation.Value;


public class EmployeeDetailsProjection {

    private String name;
    private String email;
    private String departmentName;

    @Value("#{target.name + ' (' + target.email + ')'}")
    private String nameWithEmail;

    public EmployeeDetailsProjection(String name, String email, String departmentName) {
        this.name = name;
        this.email = email;
        this.departmentName = departmentName;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getNameWithEmail() {
        return nameWithEmail;
    }
}
