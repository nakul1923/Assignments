/*
 * program to implement TreeSet
 */


 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         TreeSet<Integer> l = new TreeSet<Integer>();   // we can also write "Set" and "NavigableSet" in place of TreeSet at first
 
        l.add(10);
        l.add(55);
        l.add(43);
        l.add(8);
        l.add(43);
         System.out.println(l);

     }
 }