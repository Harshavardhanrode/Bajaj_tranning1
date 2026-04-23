package org.training.example;


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private  double avg_marks;
    private List<String> subjects;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avg_marks=" + avg_marks +
                "subjects :"+ subjects +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter for age is called");
        this.age = age;
    }

    public double getAvg_marks() {
        return avg_marks;
    }

    public void setAvg_marks(double avg_marks) {
        System.out.println("setter for avg_marks is called");
        this.avg_marks = avg_marks;
    }

    public Student() {
        System.out.println("Default constructor of Student is called");
        name="";
        this.age = 0;
        this.avg_marks = 0.0;
        this.subjects = new ArrayList<String>();
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Student(String name , int age, double avg_marks, ArrayList<String> subjects) {
        System.out.println("Parameterised constructor of Student is called");
        this.name=name;
        this.age = age;
        this.avg_marks = avg_marks;
        this.subjects = subjects;

    }

    public String getName() {
        System.out.println("getter is called");
        return name;
    }

    public void setName(String name) {
        System.out.println("setter is called for name");
        this.name = name;
    }



}
