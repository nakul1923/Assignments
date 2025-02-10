/*
 * Reverse every second word in a sentence using StringBuilder.

Input:

Enter a sentence: Java is very interesting

Output:

Modified sentence: Java si very gnitseretni
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        String s = sc.nextLine();

        String[] sArr = s.split(" ");

        StringBuilder str = new StringBuilder();

        for(int i=0; i<sArr.length; i++){

            if(i%2==0){

                str.append(sArr[i]+" ");

            } else{

                StringBuilder str1 = new StringBuilder(sArr[i]);

                StringBuilder trim = str1.reverse();
    
                str.append(trim+" ");
            }

           
        }

        System.out.println(str);
    }
}