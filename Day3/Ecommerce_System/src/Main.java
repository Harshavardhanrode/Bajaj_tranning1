import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        ArrayList<OnlineOrder> onlineOrderList = new ArrayList<OnlineOrder>();
        ArrayList<StoreOrder> storeOrderList = new ArrayList<StoreOrder>();
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
                    System.out.println("Enter Order Amount");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Address");
                    String address = sc.nextLine();

                    OnlineOrder o = new OnlineOrder(order, name, amount, address, "Placed");
                    o.placeOrder();
                    onlineOrderList.add(o);

                    break;
                }
                case 2:{

                    System.out.println("Enter Order ID");
                    int order = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Product name");
                    String name = sc.nextLine();
                    System.out.println("Enter Order Amount");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Address");
                    String Location = sc.nextLine();
                    StoreOrder s = new StoreOrder(order, name, amount, Location, "Placed");
                    s.placeOrder();
                    storeOrderList.add(s);

                    break;
                }
                case 3:{
                    System.out.println("Enter OrderId");
                    int orderid = sc.nextInt();
                    boolean found = false;
                    for (OnlineOrder o : onlineOrderList){
                        if(o.getOrderId() == orderid){
                            try {
                                o.cancelOrder(orderid);
                                System.out.println("Order cancelled successfully.");
                            } catch (InvalidOrderException e) {
                                System.out.println("Error cancelling order.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        for (StoreOrder s : storeOrderList){
                            if(s.getOrderId() == orderid){
                                try {
                                    s.cancelOrder(orderid);
                                    System.out.println("Order cancelled successfully.");
                                } catch (InvalidOrderException e) {
                                    System.out.println("Error cancelling order.");
                                }
                                found = true;
                                break;
                            }
                        }
                    }
                    if(!found){
                        System.out.println("Order not found.");
                    }

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
