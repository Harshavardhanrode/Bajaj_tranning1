package org.training.example.employeeManagment;

import java.util.List;

public class Employee {
    private int empid;

    public void setCertificates(List<Certification> certificates) {
        this.certificates = certificates;
    }

    public void setPayslip(PaySlip payslip) {
        this.payslip = payslip;
    }

    private String name;
    private double salary;
    private List<Projects> projects;
    private List<Certification>certificates;
    private PaySlip payslip;

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                ", certificates=" + certificates +
                ", payslip=" + payslip +
                '}';
    }

    public Employee() {
    }

    public Employee(int empid, String name, double salary, List<Projects> projects,PaySlip payslip,List<Certification>certificates) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.projects = projects;
        this.payslip = new PaySlip();
        this.certificates = certificates;
    }



    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }


}
