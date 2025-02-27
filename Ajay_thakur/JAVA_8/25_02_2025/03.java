/*
 * Problem with stream
 */

 /*
  * 
  l.stream() - stream is method which is used to provide object of stream 

Stream s = l.stream() 

here Stream is interface, l is a collection, stream() is a method and s is reference.


filter() - the filter method is used to select elements as per the predicate passed as an argument.

collect(Collerctors.toList());  -  It used to collect the final processed result into the another list. 

collect() - the collect method is used to return the result of the intermediate operations performed on the stream

  */

import java.util.stream.Collectors;
import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         ArrayList<Integer> l = new ArrayList<>();
    
         l.add(10);
         l.add(11);
         l.add(12);
         l.add(13);
         l.add(14);
         l.add(15);
 
         System.out.println(l);
         List<Integer> l2 = l.stream().filter(x->x%2==0).collect(Collectors.toList());          

         System.out.println(l2);
 
     }
 }