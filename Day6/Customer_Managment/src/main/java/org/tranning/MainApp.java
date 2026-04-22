package org.tranning;


import org.tranning.model.Customer;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        CustomerService service = new CustomerService();
        ExcelExporter excel = new ExcelExporter();

        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Process Customers");
            System.out.println("4. Export to Excel");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();
                    service.addCustomer(name, bal);
                    break;

                case 2:
                    List<Customer> list = service.getAllCustomers();
                    list.forEach(System.out::println);
                    break;

                case 3:
                    service.processCustomers(service.getAllCustomers());
                    break;

                case 4:
                    excel.export(service.getAllCustomers());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
