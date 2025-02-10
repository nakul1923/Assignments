/*
 * 
 * Program to implement Stack
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

         System.out.println(s.pop());
         System.out.println(s);

         System.out.println(s.peek());
         System.out.println(s);

         System.out.println(s.search(30));
         System.out.println(s.search(20));
     }
 }