/*
 * another method to build 03 program
 */

 import java.util.stream.*;
 import java.util.*;
import java.util.function.Predicate;

 
  class Main{
  
      public static void main(String[] args) {
          
          ArrayList<Integer> l = new ArrayList<>();
     
          l.add(10);
          l.add(11);
          l.add(12);
          l.add(13);
          l.add(14);
          l.add(15);
  
          System.out.println(l);
          
          Stream<Integer> s = l.stream();

          Predicate<Integer> p = x->x%2==0;

          List<Integer> l2 = s.filter(p).collect(Collectors.toList());

          System.out.println(l2);
        
      }
  }