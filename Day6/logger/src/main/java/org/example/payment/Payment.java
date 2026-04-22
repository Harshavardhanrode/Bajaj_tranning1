package org.example.payment;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public interface Payment {
    void pay(double number);

    //Logger logger = LogManager.getLogger(Payment.class);
    default void logTransaction(double number){

        System.out.println("logger value is "+number);
    }
    static  boolean validateAmout(double number){
        return number>0 ? true : false;
    }
}
