/*
 * Experiment 1
 */

 import java.util.*;
 import java.io.*;
 
 class A{
 
     int test1(){
 
         try{
 
             String str = null;
             int x = str.length();

             return 90;
 
         } catch(Exception e){
 
             return 60;
         }

         return 30;
         
     }
 
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         A obj = new A();
 
         System.out.println(obj.test1());
     }
 }