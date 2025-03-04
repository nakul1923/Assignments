/*
 * in this program file is automatically created because of we direct write data in file.
 */

import java.io.IOException;
import java.io.PrintWriter;

 class Main{
 
     public static void main(String[] args) throws IOException {
         
        
         PrintWriter pw = new PrintWriter("assignments.txt");

         pw.println("hello");
         pw.println("welcome");
         pw.println(100);
         pw.close();

         System.out.println("done");
     }
 }