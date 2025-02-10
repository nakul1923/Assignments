/*
    Gives error
 *  we cannot write try block without catch if it contains checked exception
 */

 import java.util.*;
 import java.io.*;
 
 class Main{
 
     public static void main(String[] args) {
         
         System.out.println("main");

         try{

            PrintWriter pw = new PrintWriter("abc.txt");    
            pw.write("heyyyy");

         } 
         finally{

            System.out.println("chalega ya nahi");
         }

     }
 }