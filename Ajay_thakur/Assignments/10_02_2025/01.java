/*
 * Reverse a String using Stack

Write a Java program that takes a string as input and uses a stack to reverse the string.
Example:
Input: "hello"
Output: "olleh"

 */


import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        Stack<Character> v = new Stack<>();

        for(int i=0;i<ch.length;i++){

            v.push(ch[i]);
        }

        for(int i=0; i<ch.length;i++){

            System.out.print(v.pop());
        }

        
    }
}