package org.example.spring_boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootProperties {
    @Value("${spring.application.name}")
    private String appName;

    @Value("${product.title}")
    private String title;

    @Value("${product.version}")
    private Double version;

    @GetMapping("/app")
    public String app(){
        return"<br>"+"<h1 align = 'center'>"+appName+"</h1><br>"+"<b> Product title :</b>"+title+" <b>product version:</b>"+version+ "<br><a href='http://localhost:8080/employees'>list of employees</h1>";
    }


}
