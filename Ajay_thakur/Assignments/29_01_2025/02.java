/*
 * Ashok wants to determine if a given integer is an Armstrong number. He requires your help in implementing a multi-catch block to handle potential issues during user input or calculation.

1.	Create a method isArmstrongNumber that takes an integer input and returns true if it is an Armstrong number, and false otherwise. Throw an IllegalArgumentException if the input is negative.
2.	In the main method, input an integer.
3.	Utilize a multi-catch block to handle the following scenarios:
4.	If the input is negative, catch IllegalArgumentException and print "Error: Input number must be non-negative"
5.	If the input is not a valid integer, catch inputMismatchException and print "Error: Input must be a valid integer."
6.	Finally, print the result.

 */

import java.util.*;

class Main{

public static boolean isArmstrongNumber(int num){

		int num1 = num,num2=num;
		int rem,count = 0,sum = 0;
	
		while(num>0){

			count ++;
			num = num/10;
		}

		while(num1>0){

			rem = num1%10;
			int mul = 1;
			
			for(int i=0; i<count; i++){

				mul = mul*rem;
			}

			sum = sum + mul;
			num1 = num1/10;
		}


		if(num2==sum){

		        return true;
		} else{
			return false;
		}
		
	

}

public static void main(String []args){
	
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	
	try{

		int num = sc.nextInt();

			if(num<0){

				try{

					throw new IllegalArgumentException("please enter positive number");

				}catch(IllegalArgumentException rr){

					System.out.println("Please enter positive number");
				}
			}
	
		System.out.println(isArmstrongNumber(num));
	} catch(InputMismatchException ee){
		
		System.out.println("Input must be a valid integer");
	}
	

}

}

