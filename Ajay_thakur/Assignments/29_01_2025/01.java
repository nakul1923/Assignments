/*
 * Sampad wants to implement a program that takes input for a student's name and grade, validates the input, and then displays the grade for the given student.

1.	The grade should be an integer value.
2.	The program should validate the grade using the validateGrade() method. The method should throw an IllegalArgumentException if the grade is less than 0 or greater than 100.
3.	If the input is invalid due to a non-integer grade, catch the NumberFormatException and print the built-in exception message.
4.	If the input is invalid due to an out-of-range grade, catch the IllegalArgumentException and print the built-in exception message.
5.	Catch the exceptions using the multi-catch block.

 */


import java.util.*;


class Main{

	
	static void validateGrade(String name,int grade){

		if(grade<0||grade>100){
			
			try{
				throw new IllegalArgumentException("please enter valid grade");
			} catch(IllegalArgumentException ee){

				System.out.println(ee);
			}
			
		}

		System.out.println("Grade for Student " + name +" is " + grade);

		

	}

	public static void main(String []args){

	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter name of Student");
		String name = sc.nextLine();
		System.out.println("Enter Grade");
		
		try{

			int grade = sc.nextInt();
			validateGrade(name,grade);

		} catch(InputMismatchException rr){
			
			rr.printStackTrace();

		}

		
		

	}

}