/*
 * 
Divide by zero exception.
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

        System.out.println("Enter two numbers separated with space");

        String s = sc.nextLine();

        int[] arr = new int[2];

        int a,b;

        String[] sArr = s.split(" ");

        a = Integer.parseInt(sArr[0]);
        b = Integer.parseInt(sArr[1]);
         try{

            System.out.println("Divison is " + a/b);
         } catch(ArithmeticException aa){

            System.out.println(aa);
            // aa.printStackTrace();
         }
        
    }
}