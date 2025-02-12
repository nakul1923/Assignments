/*
 * TreeSet sort String based on their UNICODE and program to implement 
 */


 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         SortedSet<String> l = new TreeSet<String>();   
 
        l.add("abc");
        l.add("xyz");
        l.add("katappa");
        l.add("Www");
         System.out.println(l);

         System.out.println(l.first());
         System.out.println(l.last());
         System.out.println(l.headSet("katappa"));
         

     }
 }