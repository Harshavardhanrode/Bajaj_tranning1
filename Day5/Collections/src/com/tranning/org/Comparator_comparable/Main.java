package com.tranning.org.Comparator_comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    double salary;

    Student(int age, String name , double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Student s) {
        return this.age - s.age; // sort by age
    }
}
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // sort by name
    }
}
class SalaryComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.salary, s2.salary); // sort by salary
    }
}
public class Main {
    public  static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student(22, "A",20000));
        list.add(new Student(18, "B",50000));
        list.add(new Student(25, "C",10000));

        //Collections.sort(list);
        //Collections.sort(list, new NameComparator());
        Collections.sort(list, new SalaryComparator());

        for (Student s : list) {
            System.out.println(s.age + " " + s.name+" "+s.salary);
        }

    }
}
