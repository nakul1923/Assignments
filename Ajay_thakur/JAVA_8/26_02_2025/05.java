/*
 * program to implement forEach() method
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
         
         l.stream().filter(x->x%2==1).forEach(y->System.out.println(y));
     }
 }