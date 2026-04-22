package com.tranning.org.payment;

public class SbiBankPaymentMain {
    public static void main(String[] args){
        Payment payObj = new CreditCardPayment();
        payObj.logTransaction(1000);
        payObj.pay();
    }
}
