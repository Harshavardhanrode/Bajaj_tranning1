package org.tranning.employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class  EmployeeServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(EmployeeServiceApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Employee Service";
    }
}
