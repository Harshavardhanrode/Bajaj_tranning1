package org.example.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static  void main(String[] args){
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
    }
}
