/*
 * program to implement sorted() method with comparator as argument
 * 
 * in this program we did decreasing order
 */

 import java.util.ArrayList;
 import java.util.List;
 import java.util.stream.Collectors;
 
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
         List<Integer> l2  = l.stream().filter(x->x%2==0).distinct().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
 
         System.out.println(l2);
     }
 }