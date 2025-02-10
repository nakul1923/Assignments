/*
 * this program not gives error becasuse in this we are increasing the hierarchy
 * 
 * as we go from called place to calling place the hierarchy of exception object should increase but it should not decrease.
 */

 import java.util.*;
 import java.io.*;
 
 
 class A{
 
     void test1() throws Exception
     {
 
         System.out.println("test1");
         test2();
     }
 
     void test2() throws Exception{                   
 
         System.out.println("test2");
         test3();
     }
 
     void test3() throws FileNotFoundException{
 
         System.out.println("test3");
         PrintWriter pw = new PrintWriter("abc.txt");
     }
 }
 
 class Main{
 
     public static void main(String[] args)  {
         
         A obj = new A();
  
         try{

            obj.test1();

         } catch(Exception rr){

            
         }
             
         System.out.println("done");
     }
 }