import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        ArrayList<OnlineOrder> onlineOrderList = new ArrayList<OnlineOrder>();
        ArrayList<StroreOrder> storeOrderList = new ArrayList<StroreOrder>();
        int choice=1;
        Scanner sc = new Scanner(System.in);
        while(choice !=4){
            System.out.println("Enter your choice :\n"+ "1. Place Online Order\n" +
                    "2. Place Store Order\n" +
                    "3. Cancel Order\n" +
                    "4. Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Enter Order ID");
                    int order = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Product name");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter Order Amount");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Address");
                    String address = sc.nextLine();

                    onlineOrderList.add(new OnlineOrder(order,amount,address,"Placed"));

                    break;
                }
                case 2:{

                    System.out.println("Enter Order ID");
                    int order = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Product name");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter Order Amount");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Address");
                    String Location = sc.nextLine();
                    storeOrderList.add(new StroreOrder(order,amount,Location,"Cancelled"));

                    break;
                }
                case 3:{
//                    System.out.println("Enter OrderId");
//                    int orderid = sc.nextInt();
//                    for (Order o : orderArrayList){
//                        if(o instanceof OnlineOrder){
//                            if()
//                        }
//                    }

                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    System.out.println("invalid choice");
                }
            }
        }
    }
}
