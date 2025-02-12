/*
 * :Basic Exception Handling:

Write a program to divide two numbers input by the user. Handle exceptions for the following:
Division by zero
Invalid input (e.g., entering non-numeric values)
Ensure the program continues to run until the user chooses to exit. 
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(true){
            
            try{

                int a,b;
                System.out.println("Enter two numbers you want to divide");
                a = sc.nextInt();
                b = sc.nextInt();

                System.out.println("divison is " + a/b);

                System.out.println("if you want to exit than divide a number with 0");
            } catch(ArithmeticException aa){

                System.out.println("Exited");
                break;
            }
            

        }
    }
}