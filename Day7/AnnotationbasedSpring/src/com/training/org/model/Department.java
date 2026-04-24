package com.training.org.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
    private int deptId;
    private String deptName;
    private String deptLocation;

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptLocation='" + deptLocation + '\'' +
                '}';
    }

    public Department() {
        System.out.println("Department default constructor called");
    }

    public Department(int deptId, String deptName, String deptLocation) {
        System.out.println("Department parameterized constructor called");
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptLocation = deptLocation;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        System.out.println("Department setDeptId called");
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        System.out.println("Department setDeptName called");
        this.deptName = deptName;
    }

    public String getDeptLocation() {
        return deptLocation;
    }

    public void setDeptLocation(String deptLocation) {
        System.out.println("Department setDeptLocation called");
        this.deptLocation = deptLocation;
    }
}
