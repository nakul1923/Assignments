/*
 * Program to write data in existing file.
 */

 
import java.io.FileWriter;
import java.io.IOException;
 
 
  class Main{
  
      public static void main(String[] args) throws IOException {
          
         FileWriter fw = new FileWriter("info.txt",true);

         
         fw.write("HTML");
         fw.write("CSS");
         fw.close();;
 
          System.out.println("done");
      }
  }