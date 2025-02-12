/*
 * It is short method of previous program
 */

 import java.util.*;

 class MySorting implements Comparator<Integer>{
 
     public int compare(Integer i1,Integer i2){
 
         return -i1.compareTo(i2);
     }
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         
         TreeSet<Integer> t = new TreeSet<>(new MySorting());
 
         t.add(10);
         t.add(5);
         t.add(15);
         t.add(25);
 
         System.out.println(t);
     }
 }