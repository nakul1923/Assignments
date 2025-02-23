/*
 * Program to implement LinkedHashMap
 */

 import java.util.Hashtable;
import java.util.LinkedHashMap;

 class Main{
 
     public static void main(String[] args) {
         
         LinkedHashMap<String,Integer> m = new LinkedHashMap<>();
 
         m.put("abc", 76656);
         m.put("xyz", 756546);
         m.put("www", 8765);
         m.put("katappa", 98575);
        
         System.out.println(m);
     }
 }