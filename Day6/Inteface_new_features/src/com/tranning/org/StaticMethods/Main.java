package com.tranning.org.StaticMethods;

interface MathUtils{
    static int add(int a,int b){
        return a+b;
    }
}

public class Main {
    public  static  void main(String[] args){
        int result = MathUtils.add(5,10);
        System.out.println("result is "+result);
    }
}
