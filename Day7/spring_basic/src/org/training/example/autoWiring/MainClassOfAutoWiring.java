package org.training.example.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.example.Student;

public class MainClassOfAutoWiring {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  // application context as ioc container
        A a1 = (A) context.getBean("a");
        System.out.println(a1);
    }

}
