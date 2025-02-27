/*
 *  program to implement anyMatch() method it is used to check if any element is matching the condition of predicate or not.
 * 
 * if at least one element is matching condition then it return true otherwise returns false.
 */

 import java.util.ArrayList;

 
 class Main{
 
     public static void main(String[] args) {
         
         ArrayList<Integer> l = new ArrayList<>();
 
         l.add(12);
         l.add(10);
         l.add(14);
         l.add(11);
         l.add(13);
         l.add(15);
         l.add(16);
         l.add(10);         
         l.add(13);
 
         System.out.println(l);
         
         boolean b = l.stream().anyMatch(x->x%2==0);

         System.out.println(b);
     }
 }