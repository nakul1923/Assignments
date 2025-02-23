/*
 * Program to implement TreeMap
 */

 import java.util.*;


 class Main{
 
     public static void main(String[] args) {
         
         TreeMap<String,Integer> m = new TreeMap<>();
 
         m.put("abc", 76656);
         m.put("xyz", 756546);
         m.put("www", 8765);
         m.put("katappa", 98575);
        
         System.out.println(m);
     }
 }