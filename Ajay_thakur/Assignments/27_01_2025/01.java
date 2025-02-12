/*
 * Create a class named Main with the attribute "number" as an integer.
Write a program to catch IllegalArgumentException and ArithmeticException for the given input.
1.	If the input provided is 0, the program should throw an "ArithmeticException" with a message.
2.	If the input provided is greater than 7, the program should throw an "IllegalArgumentException" with a message.
3.	If neither of the above cases is true, the program should return the given number.

HINT: Use nested try block for both the exception.
Input format :
Input consists of an integer.
Output format :
Refer to the sample output for reference.

 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // System.out.println("Start");

        if(num==0){

            throw new ArithmeticException("you entered invalid number: 0");
        }
        if(num>7){

            throw new IllegalArgumentException("you entere invalid number: <7");
        } else{

            System.out.println(num);
        }


        // System.out.println("End");

        
    }
}