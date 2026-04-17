import java.util.ArrayList;

public class Manager  extends Employee{
    private String managerName;

    @Override
    public String toString() {
        return "Manager{" +
                "managerName='" + managerName + '\'' +
                ", projectArr=" + projectArr +
                ", emplist=" + emplist +
                '}';
    }
    private ArrayList<Project> projectArr;
    private ArrayList<Employee> emplist;

    public Manager() {
        super();
        this.managerName = "";
    }

    public Manager(int empId, String name, double basicSalary, String managerName) {
        super(empId, name, basicSalary);
        this.managerName = name;
    }

    public void addProjectToManager(Project p){
        this.projectArr.add(p);
    }
    public void showManagerDetails(){
        System.out.println("Manager name :"+ this.managerName);


    }
}
