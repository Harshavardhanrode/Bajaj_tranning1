package org.training.example.employeeManagment;

public class Projects {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    private String company;

    public Projects(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public Projects() {

    }
}
