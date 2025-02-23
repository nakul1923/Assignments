/*
 * different types to iterate a Map
 */


 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.Map;
 import java.util.Set;
 
 class Main{
 
     public static void main(String[] args) {
         
         HashMap<String,Integer> m = new HashMap<>();
 
         m.put("abc ", 10234);
         m.put("xyz", 32453);
         m.put("www", 55334);
         m.put("katappa", 34654356);
 

         for(String s1:m.keySet()){

            System.out.println(s1);
         }

         for(Integer i:m.values()){

            System.out.println(i);
         }
 
         for(Map.Entry m1:m.entrySet()){

            System.out.print(m1.getKey());
            System.out.println(m1.getValue());
         }
     
 
     }
 }