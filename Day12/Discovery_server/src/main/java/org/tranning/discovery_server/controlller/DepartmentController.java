package org.tranning.discovery_server.controlller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @GetMapping("/name")
    public String getname(){
        return "department";

    }
}
