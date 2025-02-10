/*
 *  finally block
 */

 import java.util.*;
 import java.io.*;
 
 class Main{
 
     public static void main(String[] args) {
         
         System.out.println("main");

         try{

            int z = 10/0;

         } 
         catch(Exception rr){

            System.out.println("file related issue");
         } finally{

            System.out.println("compulsory");
         }
 
        
         System.out.println("done");
     }
 }