package org.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(Application.class, args);


        String [] beans = ctx.getBeanDefinitionNames();
        Arrays.sort(beans);
        for(String beanname : beans){
            System.out.println("--> "+ beanname);
        }






    }
    @GetMapping("/")
    public String Welcome()
    {
        return "<h1>Welcome</h1>";
    }

}

