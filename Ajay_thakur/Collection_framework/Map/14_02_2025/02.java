/*
 * program to implement Map and HashMap in this we made collection of values, Set of keys and Set of entrySet. and methods of Map
 */

 import java.util.HashMap;
 import java.util.Map;
 import java.util.Set;
 import java.util.Collection;
 
 class Main{
 
     public static void main(String[] args) {
         
         Map<Integer,String> m = new HashMap<Integer,String>();
 
         m.put(101, "rashmika");
         m.put(102, "deepika");
         m.put(103, "katappa");
         m.put(103, "shivgami");
 
         System.out.println(m);
 
         Set s = m.keySet();
 
         System.out.println(s);
 
         Collection<String> c = m.values();
 
         System.out.println(c);
 
         System.out.println(c.contains("rashmika"));
 
         Set s1 = m.entrySet();
 
         System.out.println(s1);

         System.out.println(m.containsKey(102));
         
         System.out.println(m.containsValue("deepika"));

         System.out.println(m.get(102));

         System.out.println(m.isEmpty());

         m.put(104, "bhallaldev");

         System.out.println(m);

        
     }
 }
 