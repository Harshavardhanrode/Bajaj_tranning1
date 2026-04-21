package com.tranning.org;

import java.util.*;

public class MainProject {

    public static  void main(String[] args){
        ArrayList<Project> listOfProjects = new ArrayList<Project>();
        ArrayList<String> members = new ArrayList<String>();

        members.add("harsh");
        members.add("rajveer");
        members.add("kushal");
        members.add("ramesh");
        members.add("rajiv");

        listOfProjects.add(new Project(new Date(),members,"Ajit patil","Ai project"));

//        Iterator itr = listOfProjects.iterator();
//
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }

        Vector<String> v = new Vector<String>();
        v.add("rajesh");
        v.add("kalpesh");
        v.add("ramesh");

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
