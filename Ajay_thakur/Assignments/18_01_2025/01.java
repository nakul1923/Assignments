/*
 * WAP to check given string is palindrome or not
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String");

        String s = sc.nextLine();

        int flag = 1;

        for(int i = 0; i<(s.length())/2;i++){

            if(s.charAt(i)!=s.charAt(s.length()-1-i)){

                flag = 0;
            }
        }

        if(flag==1){

            System.out.println("Given String is palindrome");
        } else{

            System.out.println("Given string is not palindrome");
        }
    }
}