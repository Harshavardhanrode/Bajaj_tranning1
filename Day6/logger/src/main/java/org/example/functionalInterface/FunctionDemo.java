package org.example.functionalInterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function <String ,Integer> length = str ->str.length();
        System.out.println(length.apply("Hello World"));
    }
}
