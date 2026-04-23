package org.training.example;

import java.util.List;

public class Employee {
    private int empid;
    private  String name;
    private double salary;
    private long phoneno;
    private List<String> address;
    private List<String> technologies;

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneno=" + phoneno +
                ", designation='" + designation + '\'' +
                ", address=" + address +
                ", technologies=" + technologies +
                '}';
    }

    private String designation;

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }



}
