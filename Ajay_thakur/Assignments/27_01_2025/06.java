/*
 * Handling Driving License Registration Exceptions

Write a program to approve or display suitable exceptions whenever a person tries to register for a driving license.
Create a class named Main with the following attributes 
1.	name - String
2.	userAge - int
3.	mark - int
Minimum eligibility for obtaining a driving license:
1.	Age should be above 18 years old.
2.	A person should pass the road rules eligibility test (with above 80 marks) for a total mark of 100.
Create two exceptions InvalidAgeForDrivingLicenseException and InvalidMarkForDrivingLicenseException to handle the above scenarios.
Input format :
The first line consists of a name a String.
The second line consists of age as an integer.
The next line consists of marks obtained as integers.
Output format :
The output should display "Approved" if he meets the criteria or the appropriate exception.

 */

import java.util.*;

class InvalidAgeForDrivingLicenseException extends RuntimeException{

    InvalidAgeForDrivingLicenseException(String str){

        super(str);
    }
}

class InvalidMarkForDrivingLicenseException extends RuntimeException{

    InvalidMarkForDrivingLicenseException(String str){

        super(str);
    }
}


class Main{

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter marks");
        int mark= sc.nextInt();

        if(age<18&&age>0){

            throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
        } else if(age<0||age>100){

            throw new InvalidAgeForDrivingLicenseException("Invalid age");
        }

        if(mark<80&&mark>=0){

            throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
        }else if(mark>100||mark<0){

            throw new InvalidMarkForDrivingLicenseException("Invalid mark");
        }

        System.out.println("Approved");
    }
}