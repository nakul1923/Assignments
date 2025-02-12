/*
 * Gives error bcoz we cannot add heterogenous data in TreeSet
 */


 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         Set l = new TreeSet<>();   
 
        l.add(10);
        l.add(55);
        l.add(43);
        l.add(8);
        l.add(43);
        l.add("katappa");
         System.out.println(l);

     }
 }