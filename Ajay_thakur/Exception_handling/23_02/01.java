/*
 * gives error
 * 
 * 
if we have return statement in try block as well as all the catches than we cannot write any statement after that 
 */

 import java.util.*;
 import java.io.*;
 
 class A{
 
     int test1(){
 
         try{
 
             String str = null;
             int x = str.length();
             return 10;
 
         } catch(ArrayIndexOutOfBoundsException e){

            return 20;
         }
         
         catch(Exception e){
 
             return 30;
         }
         return 60;
         
     }
 
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         A obj = new A();
 
         System.out.println(obj.test1());
     }
 }