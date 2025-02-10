/*
 *  Convert each character of a string to its ASCII value using String.

Input:

Enter a string: ABC

Output:

ASCII values: 65 66 67

 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("ASCII values of characters present in array : ");

        for(int i = 0; i<s.length(); i++){

            char ch = s.charAt(i);
            int ascii = (int)ch;
            System.out.println(s.charAt(i) + " = " + ascii);
        }
    }
}