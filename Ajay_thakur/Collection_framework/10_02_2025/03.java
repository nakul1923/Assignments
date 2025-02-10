/*
 * 
 * Program to implement Enumeration
 */

 import java.util.*;
 import java.io.*;
 
 class Main{
 
     public static void main(String[] args) {
         
         Stack<Integer> s = new Stack<>();
 
         s.push(10);
         s.push(20);
         s.push(30);
         s.push(40);
         System.out.println(s);

        Enumeration e = s.elements();

        while(e.hasMoreElements()){

            Integer i = (Integer)e.nextElement();
            System.out.println(i);
        }
    }

}