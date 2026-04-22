package org.example.payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreditCardPayment implements Payment{

    Logger logger = LogManager.getLogger(CreditCardPayment.class);
    @Override
    public void pay(){
        logger.info("pay method from CreditCardPayment is");
    }


}
