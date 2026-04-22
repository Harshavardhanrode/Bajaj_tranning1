package org.example.functionalInterface;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = str -> System.out.println(str);
        print.accept("Hello, Consumer!");


        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get() );
    }
}
