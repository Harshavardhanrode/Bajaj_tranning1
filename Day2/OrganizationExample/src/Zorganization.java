import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Zorganization {
    public static  void main(String[] args){
        //3
        Employee e1 = new Wagemployee(7,"harsh",80000,9);
        Employee e2 = new Salesemployee(8,"suraj",70000,1000);

        ArrayList<Employee> arr= new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        Project p1 = new Project("Ecommerce" , "Bajaj",new Date());
        p1.addEmployeeToProject(e1);
        p1.addEmployeeToProject(e2);


        //Manager m1 = new Manager(2,"kaustubh",15000000,)



        //2
        /*HashMap<String , Integer> map = new HashMap<>();
        map.put("january",31);
        map.put("february",29);
        map.put("march",31);
        map.put("april",30);
        map.put("may",31);
        map.put("june",30);
        map.put("july",31);
        map.put("august",31);
        map.put("september",30);
        map.put("octomber",31);
        map.put("november",30);
        map.put("December",31);
        Scanner sc = new Scanner(System.in);
        Salesemployee s1 = new Salesemployee(2,"harsh",50000,10000);
//        s1.calculateSalary();
//        System.out.println(s1);
        Wagemployee w1 = new Wagemployee(3,"harsh",50000,9);

        System.out.println("Enter the month to calculate wages");
        String month = sc.next();
        System.out.println("wages is :"+ w1.calculatewages(map.get(month)));

        */


        //1
        /*ArrayList<Employee> emplist = new ArrayList<Employee>();
        char ch;
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println(" Enter your choice : 1)add 2)display 3)search 4)delete 5)Increase 10% salary 6)  7)emp with salary more than avg salary ");
            choice = input.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("Emter empid:");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Emter name:");
                    String name = input.nextLine();

                    System.out.println("Emter salary:");
                    double salary = input.nextDouble();
                    input.nextLine();

                    emplist.add(new Employee(id,name ,salary));
                    break;
                }
                case 2:{
                    System.out.println("Employee details");
                    for (Employee e :emplist){
                        System.out.println(e);
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter the name you want to search :");
                    input.nextLine();
                    String name = input.next();
                    boolean flag =false;
                    for (Employee e : emplist){
                        if(e.getName().equals(name)){
                            System.out.println("Employee is present");
                            flag =true;
                            break;

                        }
                    }
                    if (!flag)
                        System.out.println("employee not present");
                    break;
                }
                case 4:{
                    System.out.println("Enter the id you want to remove :");
                    int id = input.nextInt();

                    for (int i = 0; i <emplist.size() ; i++) {
                        if(emplist.get(i).getEmpId() == id){
                            emplist.remove(i);
                        }
                    }
                    break;
                }
                case 5:{
                    for (int i = 0; i <emplist.size() ; i++) {
                        if(emplist.get(i).getBasicSalary() < 30000){
                            emplist.get(i).setBasicSalary( (emplist.get(i).getBasicSalary())* 1.1 );
                        }
                    }
                    break;
                }
                case 6:{
                    for (int i = 0; i <emplist.size() ; i++) {
                        if(emplist.get(i).getBasicSalary() < 30000){
                            emplist.get(i).setBasicSalary( (emplist.get(i).getBasicSalary())* 1.1 );
                        }
                    }
                    break;
                }
                case 7:{
                    double avg = 0.0;
                    for (Employee e : emplist){
                        avg +=e.getBasicSalary();
                    }
                    System.out.println("emps with sal more than avg sal");
                    for (Employee e : emplist){
                        if(e.getBasicSalary()>avg)
                            System.out.println(e);
                    }
                    break;
                }
                case 8:{
                    for (int i = 0; i <emplist.size() ; i++) {
                        if(emplist.get(i).getBasicSalary() < 30000){
                            emplist.get(i).setBasicSalary( (emplist.get(i).getBasicSalary())* 1.1 );
                        }
                    }
                    break;
                }
                default:
                    System.out.println("invalid choice;");

            }

            System.out.println("do yo want to continue :");
            ch = input.next().charAt(0);
        }while(ch=='y' || ch =='Y');*/

    }
}
