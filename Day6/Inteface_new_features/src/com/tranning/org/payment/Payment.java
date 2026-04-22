package com.tranning.org.payment;

public interface Payment {
    void pay();

    default void logTransaction(double number){
        System.out.println("logger value is "+number);
    }
}
