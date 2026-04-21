package com.tranning.org;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String  projectName;
    private String projectManager;
    private ArrayList<String> teamMembers;
    private Date startDated;


    public Project() {
        super();

    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", projectManager='" + projectManager + '\'' +
                ", teamMembers=" + teamMembers +
                ", startDated=" + startDated +
                '}';
    }

    public Project(Date startDated, ArrayList<String> teamMembers, String projectManager, String projectName) {
        super();
        this.startDated = startDated;
        this.teamMembers = teamMembers;
        this.projectManager = projectManager;
        this.projectName = projectName;
    }
}
