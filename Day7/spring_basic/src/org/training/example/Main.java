package org.training.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {
    public static void main(String[] args) {

//        Resource resource = new ClassPathResource("applicationContext.xml");  // beanfactory as ioc container
//        BeanFactory factory = new XmlBeanFactory(resource);


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  // application context as ioc container

        Student student = (Student) context.getBean("studentbean");
        System.out.println(student);

        Teacher t1 = (Teacher) context.getBean("teacherbean");
        System.out.println(t1);


        Employee emp = (Employee) context.getBean("employeebean");
        System.out.println(emp);
    }
}