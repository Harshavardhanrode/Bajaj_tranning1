 public class Employee {
    private int empId;
    private String name;
    private double basicSalary;
    private Address permanatAdd ,tempAdd;

     public double getBasicSalary() {
         return basicSalary;
     }

     public void setBasicSalary(double basicSalary) {
         this.basicSalary = basicSalary;
     }

     public int getEmpId() {
         return empId;
     }

     public void setEmpId(int empId) {
         this.empId = empId;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "empId=" + empId +
                 ", name='" + name + '\'' +
                 ", basicSalary=" + basicSalary +
                 '}';
     }

     public Employee() {
        System.out.println("default cons");
         permanatAdd = new Address();
         tempAdd = new Address();
    }

    public Employee(int empId, String name, double basicSalary ,Address a,Address b) {
        System.out.println("paramiterised cons");
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        permanatAdd = a;
        tempAdd =b;
    }
}
