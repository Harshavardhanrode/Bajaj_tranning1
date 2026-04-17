import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String projectName;
    private String clientName;
    private ArrayList<String> technologystack;
    private ArrayList<Employee> projectMembers;
    private Date startDate;


    public Project() {
        this.projectName = "";
        this.clientName = "";
        this.technologystack = new ArrayList<String>();
        this.projectMembers = new ArrayList<Employee>();
        this.startDate = new Date();
    }
    public Project(String projectName, String clientName, Date startDate) {
        this.projectName = projectName;
        this.clientName = clientName;
        this.technologystack = new ArrayList<String>();
        this.projectMembers =  new ArrayList<Employee>();
        this.startDate = startDate;
    }
    public void addEmployeeToProject(Employee e){
        this.projectMembers.add(e);
    }

}
