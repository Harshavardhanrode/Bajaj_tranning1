package com.training.org.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String name;
    @Autowired
    private Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }

    public Employee(int empId, String name, Department department) {
        System.out.println("Employee parameterized constructor called");
        this.empId = empId;
        this.name = name;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        System.out.println("Employee setEmpId called");
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Employee setName called");
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        System.out.println("Employee setDepartment called");
        this.department = department;
    }

    public Employee() {
        super();
    }
}
