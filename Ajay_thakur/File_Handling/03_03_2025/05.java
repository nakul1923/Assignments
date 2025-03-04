/*
 * Program to read data from a file
 */

 import java.io.FileReader;
import java.io.IOException;
 
 
  class Main{
  
      public static void main(String[] args) throws IOException {
          
         FileReader fr = new FileReader("info.txt");

         int i = fr.read();

         while(i!= -1){

            System.out.println((char)i);
            i = fr.read();
         }
         fr.close();
 
          System.out.println("done");
      }
  }