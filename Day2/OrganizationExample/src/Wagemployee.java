import java.util.HashMap;

public class Wagemployee extends Employee{
    private double wage;
    private  int noOfWorkingHours;

    public Wagemployee() {
        super();
        this.wage = 0.0;
        this.noOfWorkingHours = 0;
    }

    public Wagemployee(int empId, String name, double basicSalary, int noOfWorkingHours) {
        super(empId, name, basicSalary);
        this.wage = 0.0;
        this.noOfWorkingHours = noOfWorkingHours;
    }

    public double calculatewages(int monthdates){

        this.wage = (super.getBasicSalary() / monthdates) * noOfWorkingHours;

        return this.wage;
    }
}
