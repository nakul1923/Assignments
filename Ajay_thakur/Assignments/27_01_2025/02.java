/*
 * Divide by zero exception.
Write a program to obtain two numbers and print their quotient. In case of an exception print the exception message.
Input format :
Provide a single line of input separated by a space. Obtain the integers N1 and N2.
Output format :
Display the quotient if there is no exception; otherwise, print the exception message.
Refer to the sample output for reference.
Code constraints :
Integers only.
Sample test cases :
Input 1 :
44 2
Output 1 :
22
Input 2 :
2 0
Output 2 :
java.lang.ArithmeticException

 */


import java.util.*;



class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers separated with spaces");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if(b==0){

            throw new ArithmeticException("You cannot enter 0");
        }

        int c = a/b;

        System.out.println("the quotient of two number is " + c);
    }
}