package org.example.payment;

@FunctionalInterface
public interface CustomerFilter {
    boolean apply(String name);
}
