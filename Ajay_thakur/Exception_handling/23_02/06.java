/*
 * if exception occurs then control jumps from try block to catch block. if we write System.exit than the code will be terminated hence this is the only case when finally block will not be executed.
 */

 import java.util.*;
 import java.io.*;
 
 class A{
 
     int test1(){
 
         try{
 
             String str = null;
             int x = str.length();
             return 10;
 
         }
         
         catch(Exception e){
 
            System.out.println("deepika padukone");
            System.exit(0);
             
         }
         finally{

            System.out.println("rashmika");
            
         }

         System.out.println("done");
         return 30;
         
     }
 
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         A obj = new A();
 
         System.out.println(obj.test1());
     }
 }