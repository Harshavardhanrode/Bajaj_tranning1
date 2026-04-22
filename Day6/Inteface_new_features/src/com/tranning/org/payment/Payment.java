package com.tranning.org.payment;
import java.util.logging.Logger;
public interface Payment {
    void pay();
    Logger logger = Logger.getLogger(SbiBankPaymentMain.class.getName());

    default void logTransaction(double number){
        System.out.println("logger value is "+number);
        logger.info("this is info message");
    }
}
