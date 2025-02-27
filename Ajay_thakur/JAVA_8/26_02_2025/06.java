/*
 * program to implement optional and min() method
 * 
 * map() is used to find minimum element of list it takes comparator as argument but if we sort the order of list in descending then min returns maximum value bcoz it returns the first value in the list
 * 
 * Optional is class by which we can check is there any element present in list or not, basically it is used as a optional.
 * 
 * max() method works opposite to min() method
 */

 import java.util.ArrayList;
import java.util.Optional;
 
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
         
         Optional<Integer> o = l.stream().min((x,y)->x.compareTo(y));

         if(o.isPresent()){

            System.out.println(o.get());
         }
     }
 }