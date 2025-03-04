/*
 * program to check file exist or not
 */

import java.io.File;

class Main{

    public static void main(String[] args) {
        
        File f = new File("info.txt");

        System.out.println(f.exists());
    }
}