/*
 *  we can write try block without catch block if finally is there, in case of unchecked exception
 */

 import java.util.*;
 import java.io.*;
 
 class Main{
 
     public static void main(String[] args) {
         
         System.out.println("main");

         try{

            int z = 10/0;

         } 
         finally{

            System.out.println("chalega ya nahi");
         }

     }
 }