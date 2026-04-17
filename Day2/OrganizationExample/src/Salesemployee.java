public class Salesemployee extends Employee {
    private int sales;
    private double commission;
    private double netsalary;



    public Salesemployee() {
        super();
        this.sales = 0;
        this.commission = 0.0;
        this.netsalary = 0.0;
    }

    public Salesemployee(int empId, String name, double basicSalary, int sales) {
        super(empId, name, basicSalary);
        this.sales = sales;
        this.commission = 0.0;
        this.netsalary = 0.0;
    }
    @Override
    public String toString() {
        return "Salesemployee{" +
                "sales=" + sales +
                ", commission=" + commission +
                ", netsalary=" + netsalary +
                '}';
    }

    public void calculateSalary(){
        if(sales < 5000)
            this.commission = 0.05 * super.getBasicSalary();
        else if(sales >= 5000 && sales <10000)
            this.commission = 0.10 * super.getBasicSalary();
        else if(  sales>=10000  && sales < 15000)
            this.commission = 0.15 * super.getBasicSalary();
        else if(sales >= 15000 && sales <50000 )
            this.commission = 0.25 * super.getBasicSalary();
        else if(sales >= 50000)
            this.commission = 0.50 * super.getBasicSalary();
        else
            System.out.println("commission is not applicable to you");
        this.netsalary = super.getBasicSalary() + this.commission;

    }
}
