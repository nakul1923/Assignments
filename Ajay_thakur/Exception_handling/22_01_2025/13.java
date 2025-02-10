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
 
             return 30;
         }

         System.out.println("rashmika");
     }
 
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         A obj = new A();
 
         System.out.println(obj.test1());
     }
 }