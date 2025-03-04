/*
 * program to see how to write data in file
 */

 import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

 class Main{
 
     public static void main(String[] args) throws IOException {
         
         File f = new File("info.txt");
        
         PrintWriter pw = new PrintWriter(f);

         pw.println("hello");
         pw.println("welcome");
         pw.println(100);
         pw.close();

         System.out.println("done");
     }
 }