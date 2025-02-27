/*
 * program to implement Stream on string
 */

 import java.util.stream.*;
 import java.util.*;
 
  class Main{
  
      public static void main(String[] args) {
          
          ArrayList<String> l = new ArrayList<>();
     
          l.add("abc");
          l.add("rashmika");
          l.add("rohit");
          l.add("xyz");

          System.out.println(l);
          
          List<String> l2 = l.stream().filter(x->x.startsWith("r")).collect(Collectors.toList());

          System.out.println(l2);
        
      }
  }