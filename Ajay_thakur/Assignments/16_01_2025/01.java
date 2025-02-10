/*
 * WAP to count vowels in a given string
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Girlfriend name here");
        String s = sc.nextLine();

        int count = 0;

        for(int i = 0 ; i<s.length(); i++){

            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){

                count++;
            }
        }

        System.out.println("total number of vowels present in given strings are : " + count);
    }
}