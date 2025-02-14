/*
 * program to implement Map and HashMap
 */

 import java.util.HashMap;
 import java.util.Map;
 
 class Main{
 
     public static void main(String[] args) {
         
         Map<Integer,String> m = new HashMap<Integer,String>();
 
         m.put(101, "rashmika");
         m.put(102, "deepika");
         m.put(103, "katappa");
         m.put(103, "shivgami");
 
         System.out.println(m);
 
     }
 }