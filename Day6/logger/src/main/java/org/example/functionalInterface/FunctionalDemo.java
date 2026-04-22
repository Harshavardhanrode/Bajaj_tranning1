package org.example.functionalInterface;

import java.util.*;
import java.util.function.*;

public class FunctionalDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 30, 45, 60);
        // Predicate → filter
        Predicate<Integer> isEven = n -> n % 2 == 0;
        // Function → transform
        Function<Integer, Integer> square = n -> n * n;
        // Consumer → print
        Consumer<Integer> print = n -> System.out.println(n);
        // Supplier → generate value
        Supplier<Integer> random = () -> new Random().nextInt(100);
        // Stream pipeline
        list.stream()
                .filter(isEven)      // Predicate
                .map(square)         // Function
                .forEach(print);     // Consumer
        System.out.println("Random number: " + random.get());
    }
}
