/*
 * working of sorting on Strings
 */

 import java.util.*;

 class MySorting implements Comparator<String>{
 
     public int compare(String i1,String i2){
 
         return -i1.compareTo(i2);
     }
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         
         TreeSet<String> t = new TreeSet<>(new MySorting());
 
         t.add("rashmika");
         t.add("deepika");
         t.add("katappa");
         t.add("bahubali");
 
         System.out.println(t);
     }
 }