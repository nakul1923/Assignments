/*
 * WAP to read a string from user,Read a character from user and count how many times that character occurred in that string.
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter Your Girlfriend name here");
        String s = sc.nextLine();

        System.out.println("Enter a character from your girlfriend name");
        String c = sc.next();

        int count = 0;

        for(int i = 0 ; i<s.length(); i++){

            if(s.charAt(i)==c.charAt(0)){

                count++;
            }
        }

        System.out.println("total number of given character present in given strings are : " + count);
    }
}