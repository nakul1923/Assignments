/*
 Reverse each word in a sentence using StringBuffer.

Input:

Enter a sentence: Welcome to Java

Output:

Reversed words: emocleW ot avaJ
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        String s = sc.nextLine();

        String[] sArr = s.split(" ");

        StringBuffer str = new StringBuffer();

        for(int i=0; i<sArr.length; i++){

            StringBuffer str1 = new StringBuffer(sArr[i]);

            StringBuffer trim = str1.reverse();

            str.append(trim+" ");
        }

        System.out.println(str);
    }
}