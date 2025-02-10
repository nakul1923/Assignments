/*
 * WAP to count no. of vowels and consonent in a given string
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("enter your Girlfriend name");

        String s = sc.nextLine();


        int countVowel = 0;
        int countConsonent = 0;
        
        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){

                countVowel++;
            } else{

                countConsonent++;
            }
        }

        System.out.println("Number of vowels in given String is : " + countVowel);
        System.out.println("Number of consonent in given String is : " + countConsonent);
    }
}