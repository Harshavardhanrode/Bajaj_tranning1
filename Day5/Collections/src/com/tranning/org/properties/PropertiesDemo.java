package com.tranning.org.properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args){

        Properties p = new Properties();



        p.put("harsh","rode");
        p.put("abhishek","biyani");
        p.put("rajesh","ulpe");

        //System.out.println(p.getProperty("harsh"));

        Enumeration e = p.keys();
        while (e.hasMoreElements()) {
           String key = (String) e.nextElement();
            System.out.println(e.nextElement());
        }
    }
}
