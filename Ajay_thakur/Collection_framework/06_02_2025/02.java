/*
 * program to implement Iterator methods and print only even number and remove remaining number
 */

 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         ArrayList<Integer> l = new ArrayList<>();
 
         l.add(10);
         l.add(11);
         l.add(13);
         l.add(14);
         l.add(15);
 
         System.out.println(l);
 
         Iterator itr = l.iterator();
 
         while(itr.hasNext()){
 
             Integer i = (Integer)itr.next();
             if(i%2==0){
                System.out.println(i);
             } else{

                itr.remove();
             }
             
         }

         System.out.println(l);
     }
 }