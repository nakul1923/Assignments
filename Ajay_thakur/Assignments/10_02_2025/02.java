/*
 * Write a Java program to check if a given string is a palindrome (same forward and backward) using a stack.

 */

import java.util.*;

class  Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        int flag = 1;

        char[] ch = str.toCharArray();

        Stack<Character> orig = new Stack<>();

        for(int i=0; i<ch.length;i++){

            orig.push(ch[i]);

        }

        for(int i=0; i<ch.length;i++){

            if(ch[i]==orig.pop()){

            
            } else{

                flag = 0;
            }
        }

        if(flag==1){

            System.out.println("palindrome");
        } else{

            System.out.println("not palindrome");
        }

        
    }
}