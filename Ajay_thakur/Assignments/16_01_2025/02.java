/*
 * WAP to count how many spaces are preset in a given string
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Girlfriend name here");
        String s = sc.nextLine();

        int count = 0;

        for(int i = 0 ; i<s.length(); i++){

            if(s.charAt(i)==' '){

                count++;
            }
        }

        System.out.println("total number of vowels present in given strings are : " + count);
    }
}