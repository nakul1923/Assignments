/*
 * Task:
Create a Java program to handle the following scenarios:

Division by zero using ArithmeticException.
Accessing an invalid index in an array using ArrayIndexOutOfBoundsException.
Parsing an invalid number format using NumberFormatException.
Accessing a method or field of a null object using NullPointerException.
For each case:

Write code that triggers the exception.
Handle the exception using a try-catch block.
Print meaningful messages to the user in the catch block.
Use a finally block to demonstrate cleanup or a closing statement.

 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        try{

            int a = 10/0;

            int[] arr = new int[2];

            arr[3] = 10;

            int b = Integer.parseInt(sc.nextLine());

            String s = null;

            System.out.println(s.length());

        } catch(ArithmeticException aa){

            System.out.println("Please do not divide number with 0");
        } catch(ArrayIndexOutOfBoundsException Arr){

            System.out.println("Please try to excess value that matches array size");
        } catch(NumberFormatException nn){

            System.out.println("Please input only digits");
        } catch(NullPointerException nll){

            System.out.println("The value you want to print is null");
        }
        

    }
}