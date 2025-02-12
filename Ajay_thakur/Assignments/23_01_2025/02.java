/*
 * Write a program to find the first non-repeated character in a string using StringBuffer or StringBuilder.
input :"swiss"
output :The first non-repeated character is: "w"

Explanation: The program uses StringBuffer to track character counts and returns the first character that occurs only once in the string.

 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String s = sc.nextLine();

        char c='0';

        int flag = 0;

        for(int i=0;i<s.length(); i++){

            for(int j=i+1; j<s.length();j++){

                if(s.charAt(i)==s.charAt(j)){

                    c = s.charAt(i);
                    flag =1;
                    break;
                    
                    
                }
            }
            if(flag==1){

                break;
            }
        }

        if(c=='0'){

            System.out.println("No repeated character in given string");
        } else{

            System.out.println("First non-repeated character in a given string is " + c);
        }
        
    }
}