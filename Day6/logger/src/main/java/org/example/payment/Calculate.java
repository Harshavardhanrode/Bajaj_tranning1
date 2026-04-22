package org.example.payment;

@FunctionalInterface
 interface  Calc{

     int func(int num);
}
public class Calculate{
     public  static  void main(String[] args){
         Calc c1 = new Calc() {
             @Override
             public int func(int num) {
                 return num;
             }
         };

         System.out.println(c1.func(5));

     }
}
