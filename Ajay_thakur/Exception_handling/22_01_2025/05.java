/*
   checked exception
 * 
 * in this if exception occur at runtime than only catch block execute unless it is not execute
 */

 import java.util.*;
 import java.io.*;
 
 class Main{
 
     public static void main(String[] args) {
         
         System.out.println("main");

         try{

            PrintWriter pw = new PrintWriter("abc.txt");
 
            pw.write("hello guys");

         } 
         catch(FileNotFoundException rr){

            System.out.println("file related issue");
         }
 
        
         System.out.println("done");
     }
 }