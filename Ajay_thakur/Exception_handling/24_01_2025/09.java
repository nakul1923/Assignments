/*
 * not gives error 
 * bcoz we can throw error in parent but if we throws error on child than we should throws error on parent also
 */

 import java.io.FileNotFoundException;

 class A{
 
     void test1() throws FileNotFoundException{
 
 
     }
 }
 class B extends A{
 
     void test1() {                      
 
 
     }
 }
 
 class Main{
 
     public static void main(String[] args) {
         
 
         System.out.println("main");
     }
 }