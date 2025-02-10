/*
 * Find the length of a string without using the length() method.

Input:

Enter a string: HelloWorld

Output:

Length of the string: 10
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        String s = "nakul";

        char[] c = s.toCharArray();

        int count =0 ;


        for( char t:c){

            count++;
        }

        System.out.println("Length of given string is " + count);
    }
}