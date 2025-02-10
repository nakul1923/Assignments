/*
giver error
 * if we have return statement in finally block than we cannot write even a single statement after finally
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
            return 60;
             
         }
         finally{

            System.out.println("rashmika");
            return 50;
            
         }

         System.out.println("done");
         
     }
 
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         A obj = new A();
 
         System.out.println(obj.test1());
     }
 }