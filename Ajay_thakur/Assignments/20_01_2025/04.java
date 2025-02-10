/*

 Question: Reverse the order of words in a sentence using StringBuilder.

Input:

Enter a sentence: Java is powerful

Output:

Reversed sentence: powerful is Java

 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        String s = sc.nextLine();

        String[] sArr = s.split(" ");

        StringBuffer str = new StringBuffer("");

        int count=0;

        for(int i=0; i<sArr.length; i++){

            StringBuffer temp = new StringBuffer(sArr[sArr.length-1-i]);

            str = str.insert(count, temp+" ");

            for(int j = 0;j<=temp.length(); j++){

                count++;
            }

        }

        System.out.println(str);
    }
}