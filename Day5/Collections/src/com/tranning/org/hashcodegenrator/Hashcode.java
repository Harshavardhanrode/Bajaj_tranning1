package com.tranning.org.hashcodegenrator;

import java.security.MessageDigest;
import java.util.Random;
import java.util.Scanner;

public class Hashcode {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random() ;
        System.out.println("Enter the input : ");
        String input = sc.nextLine();
        input = input+ r.nextInt(100);

        System.out.println( "Input after adding random number: " +input);
        int code = input.hashCode();
        System.out.println("Hashcode of the input is : " + code);




    }
}
