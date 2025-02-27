/*
 * another method to build 03 program
 */

 import java.util.stream.*;
 import java.util.*;

  class Main{
  
      public static void main(String[] args) {
          
          ArrayList<Integer> l = new ArrayList<>();
     
          l.add(10);
          l.add(20);
          l.add(23);
          l.add(30);
          l.add(40);
          l.add(90);
  
          System.out.println(l);
          
          List<Integer> l2 = l.stream().map(x->x+10).collect(Collectors.toList());

          System.out.println(l2);
        
      }
  }