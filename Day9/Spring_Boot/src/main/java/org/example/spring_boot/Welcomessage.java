package org.example.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Welcomessage {
    @GetMapping("/welcome")
    public String Welcome()
    {        return "<h1>Welcome</h1>";
    }

    @GetMapping("/employees")
    public ArrayList<Emoloyee> getEmployees()
    {
        ArrayList<Emoloyee> employees = new ArrayList<>();
        employees.add(new Emoloyee(1,"John", 50000));
        employees.add(new Emoloyee(2,"Jane", 60000));
        employees.add(new Emoloyee(3,"Doe", 55000));
        return employees;
    }
}
