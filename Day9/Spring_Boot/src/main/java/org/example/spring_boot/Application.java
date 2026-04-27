package org.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(Application.class, args);


        String [] beans = ctx.getBeanDefinitionNames();
        Arrays.sort(beans);
        for(String beanname : beans){
            System.out.println("--> "+ beanname);
        }
    }

}
