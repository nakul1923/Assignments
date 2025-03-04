/*
 * Program to read data from a file using BufferedReader
 */

 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
 
  class Main{
  
      public static void main(String[] args) throws IOException {
          
         FileReader fr = new FileReader("info.txt");

         BufferedReader br = new BufferedReader(fr);

         String str = br.readLine();
        
         while(str!=null){

            System.out.println(str);
            str = br.readLine();
         }
         br.close();
 
          System.out.println("done");
      }
  }