/*
 * Age Verification for Driving License
Objective: Validate a person’s age to check their eligibility for a driving license.

Details:
Define a custom exception UnderageException for people below 18 years.
Create a method verifyAge(int age) in a DrivingLicense class that throws the exception if the age is less than 18.
Simulate the verification process in the main method with test cases for eligible and ineligible candidates.
 */

import java.util.*;

class UnderAgeException extends RuntimeException{

    UnderAgeException(String str){

        super(str);
    }
}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = sc.nextInt();

        if(age<18||age>100){

            try{

                throw new UnderAgeException("you are not eligible for driving licence");
                
            } catch(UnderAgeException aa){

                System.out.println(aa);
            }
            
        } else{

            System.out.println("You are eligible for driving licence");
        }

        System.out.println("Done");

        
    }

}