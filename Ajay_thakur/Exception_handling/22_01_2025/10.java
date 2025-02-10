/*
 *  if there is a catch with checked exception than there should be at least one exception rising statements in try
 * 
 * this rule is not applicable on unchecked exception
 * 
 * that's why it's not giving error
 */

 import java.util.*;
 import java.io.*;
 
 class Main{
 
     public static void main(String[] args) {
         
         System.out.println("main");

         try{


         } catch(ArrayIndexOutOfBoundsException ee){                           //unchecked exception


         }
         

     }
 }