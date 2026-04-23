package org.training.example.autoWiring;

public class A {
    B b;

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }

    A(){
        System.out.println("A is created");
        }
    public void setB(B b){
        this.b = b;
    }
    void print(){
        System.out.println("hello a");
    }
    void display(){
        print();
        b.print();
    }
}
