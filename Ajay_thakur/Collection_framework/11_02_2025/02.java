/*
 * 
 * Program to implement LinkedHashSet
 */


 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         Set<String> l = new LinkedHashSet<String>();        //We can also write Set and HashSet here bcoz that both are child class of LinkedHashSet
 
         l.add("abc");
         l.add("xyz");
         l.add("www");
         l.add("abc");
 
         System.out.println(l);
     }
 }