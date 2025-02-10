/*
 * for checked exceptions there is no auto-ducking. we need to perform process of ducking for this purpose we will use the keyword throws to perform ducking
 * 
 * We can also write throws keyword in front of main method
 * 
 * in this case if exceptions arrives at runtime than program flow is not execute and program get terminated
 */

 import java.util.*;
 import java.io.*;
 
 
 class A{
 
     void test1() throws FileNotFoundException
     {
 
         System.out.println("test1");
         test2();
     }
 
     void test2() throws FileNotFoundException{
 
         System.out.println("test2");
         test3();
     }
 
     void test3() throws FileNotFoundException{
 
         System.out.println("test3");
         PrintWriter pw = new PrintWriter("abc.txt");
     }
 }
 
 class Main{
 
     public static void main(String[] args) throws FileNotFoundException {
         
         A obj = new A();
  
             obj.test1();
         System.out.println("done");
     }
 }