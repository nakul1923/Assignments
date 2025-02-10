/*
 * Linked List cannot support RandomAccess. it means we cannot access random data in this
 */

 import java.util.*;
 import java.io.*;
 
 class Main{
 
     public static void main(String[] args) {
         
         LinkedList<String> l = new LinkedList<String>();
 
        l.add("abc");
        l.add("xyz");
        l.add("www");
    
         System.out.println(l);
         l.addFirst("rashmika");
         System.out.println(l);
         l.addLast("nakul");
         System.out.println(l);
         l.removeFirst();
         System.out.println(l);
         l.removeLast();
         System.out.println(l);
         System.out.println(l.getFirst());
         System.out.println(l.getLast());
     }
 }