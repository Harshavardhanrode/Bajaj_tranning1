package org.example.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempClass {
    @Autowired
    AppConfig a;

    @GetMapping("/getdata")
    public String getInformation(){
       return  a.getFile().showValues();
    }
}
