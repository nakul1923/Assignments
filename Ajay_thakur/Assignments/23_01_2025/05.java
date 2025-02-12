/*
 * Write a program to find the shortest word in a sentence using String.

input :"Java is fun and powerful"
output: Shortest word: "is"
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String s = sc.nextLine();

        String sArr[] = s.split(" ");

        int min = sArr[0].length();

        String shortest = sArr[0];

        for(int i=0;i<sArr.length;i++){

            if(sArr[i].length()<min){

                min = sArr[i].length();
                shortest = sArr[i];

            }
        }

        System.out.println("Shortest word in given string = " + shortest);
        
    }
}