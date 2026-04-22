package org.tranning.streamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApis{
     public static void main(String[] args){
         List<Integer>arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         arr.stream().filter(n->n%2 ==0).forEach(System.out::println);
         List<Integer>evenList = arr.stream().filter(n->n%2==0).collect(Collectors.toList());
         System.out.println(evenList);
         long count = arr.stream().filter(n->n>3).count();
         System.out.println(count);

     }

}
