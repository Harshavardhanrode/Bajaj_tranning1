package com.tranning.org.payment;

import com.tranning.org.vehicle.Main;

import java.util.logging.Logger;

public class SbiBankPaymentMain {


    public static void main(String[] args){
        Payment payObj = new CreditCardPayment();
        payObj.logTransaction(1000);
        payObj.pay();
//        Logger logger = Logger.getLogger(SbiBankPaymentMain.class.getName());
//        logger.info("this is info message");
//        logger.warning("this is warning message");
//        logger.severe("this is severe message");




    }







}
