package org.tranning.discovery_server.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Department {

    @GetMapping("/department")
    public String getname(){
        return "Department Service";
    }
}
