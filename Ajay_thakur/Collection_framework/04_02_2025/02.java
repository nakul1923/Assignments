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
    
         System.out.println(l instanceof Cloneable);
         System.out.println(l instanceof Serializable);
         System.out.println(l instanceof RandomAccess);
     }
 }