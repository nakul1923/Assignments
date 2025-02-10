/*
 * If there is return in finally block than it will not give error and finally return will execute
 * 
 * if we have return statement in try block as well as all the catches and in finally than always return statement of finally will be executed
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
            return 65;
         }
         
     }
 
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         A obj = new A();
 
         System.out.println(obj.test1());
     }
 }