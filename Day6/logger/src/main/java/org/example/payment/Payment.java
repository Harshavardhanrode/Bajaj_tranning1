package org.example.payment;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public interface Payment {
    void pay();

    Logger logger = LogManager.getLogger(Payment.class);
    default void logTransaction(double number){

        logger.info("logger value is "+number);
    }
}
