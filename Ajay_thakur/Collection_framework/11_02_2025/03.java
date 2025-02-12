/*
 * 
 * Gives error
 */


 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         Iterable<String> l = new LinkedHashSet<>();    // Gives error bcoz there is no add() method in Iterable interface
 
         l.add("abc");
         l.add("xyz");
         l.add("www");
         l.add("abc");
 
         System.out.println(l);
     }
 }