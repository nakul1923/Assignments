/*
   checked exception
 * gives error because it detect error on compile time 
 */

import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args) {
        
        System.out.println("main");

        PrintWriter pw = new PrintWriter("abc.txt");

        pw.write("hello guys");

        System.out.println("done");
    }
}