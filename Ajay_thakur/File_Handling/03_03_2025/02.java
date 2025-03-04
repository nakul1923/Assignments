/*
 * program to create new file
 */

 import java.io.File;
import java.io.IOException;

 class Main{
 
     public static void main(String[] args) throws IOException {
         
         File f = new File("info.txt");
        
         f.createNewFile();
         System.out.println(f.exists());
     }
 }