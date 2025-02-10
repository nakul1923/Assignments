/*
 * WAP to count spaces of given string
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your girlfriend name");

        String s = sc.nextLine();

        int count = 0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){

                count++;

            }
        }

        System.out.println("Total Number of spaces in given String is : " + count);
    }
}