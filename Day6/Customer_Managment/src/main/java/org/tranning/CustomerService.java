package org.tranning;


//import com.org.tranning.model.Customer;

import org.tranning.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CustomerService {

    // Supplier → generate random ID
    Supplier<Integer> idGenerator = () -> new Random().nextInt(1000);

    // Predicate → filter high-value customers
    Predicate<Customer> highValue = c -> c.getBalance() > 5000;

    // Function → transform customer to string
    Function<Customer, String> toUpper =
            c -> c.getName().toUpperCase();

    // Consumer → print customer
    Consumer<Customer> print =
            c -> System.out.println(c.getId() + " " + c.getName() + " " + c.getBalance());

    // Add Customer
    public void addCustomer(String name, double balance) throws Exception {
        int id = idGenerator.get();

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO customer VALUES (?, ?, ?)"
        );

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, balance);

        ps.executeUpdate();
        System.out.println("Customer Added with ID: " + id);
    }

    // Fetch Customers
    public List<Customer> getAllCustomers() throws Exception {
        List<Customer> list = new ArrayList<>();

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customer");

        while (rs.next()) {
            list.add(new Customer(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3)
            ));
        }
        return list;
    }

    // Stream Operations
    public void processCustomers(List<Customer> list) {

        System.out.println("\n--- High Value Customers ---");

        list.stream()
                .filter(highValue)     // Predicate
                .peek(print)           // Consumer
                .map(toUpper)          // Function
                .forEach(System.out::println);
    }
}

