package com.tranning.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

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

        Iterator itr = listOfProjects.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
