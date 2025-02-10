/*
 * before returnig, the JVM will check is there any finally block and if finally block is present than it executes and then return the value that's why it is printing rashmika first and then returning 60
 * 
 * 
 * if we have return statement in try or catch than return value will be from try or catch but statements gives the finally block will be executed before returning
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
         }
         
     }
 
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         A obj = new A();
 
         System.out.println(obj.test1());
     }
 }