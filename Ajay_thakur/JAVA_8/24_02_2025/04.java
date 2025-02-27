/*
 * Program to implement Supplier
 */

 import java.util.Date;
import java.util.function.*;

 class Main{
 
     public static void main(String[] args) {
         
         Supplier<Date> s = ()-> new Date();
 
         System.out.println(s.get());
     }
 }