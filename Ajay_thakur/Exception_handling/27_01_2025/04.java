/*
 * 
 * in this program we are handling user define exception
 * 
 */

 import java.util.*;
 import java.io.*;
 
 
 class InvalidAge extends RuntimeException{
 
     InvalidAge(String str){
 
         super(str);
     }
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         System.out.println("main");
 
         Scanner sc = new Scanner(System.in);
 
         int age = Integer.parseInt(args[0]);
 
         if(age<10){
            
            try{
                throw new InvalidAge("Wrong Age");
            } catch(InvalidAge rr){

                System.out.println("handling done");
            }
             
         }
 
         System.out.println("end");
     }
 }