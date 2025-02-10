/*
 * Count the number of words in a sentence using String.

Input:

Enter a sentence: Java is a versatile language

Output:

Number of words: 5
 */

import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        int count = 0;

        String[] s1 = s.split(" ");

        for(int i=0;i<s1.length;i++){

            if(s1[i]==""){

                continue;
            } else{

                count++;
            }
        }

        System.out.println("total number of words in given string is " + count);

    }
    
}