/*
 * Password Strength Validator
You are developing a password strength validation system using Predicate in Java. The password must satisfy the following conditions to be considered strong:

The length must be at least 8 characters.
It must contain at least one uppercase letter (A-Z).
It must contain at least one lowercase letter (a-z).
It must contain at least one digit (0-9).
It must contain at least one special character (e.g., @, #, $, %, & etc.).
Instructions:
Create a Predicate<String> to check whether a given password is strong.
Implement the validation logic without using regex (use loops and conditions).
Test the predicate with multiple passwords.
 Input & Output:
Input 1: "Hello@123"
Output: Strong Password

Input 2: "hello123"
Output: Weak Password  (No uppercase & special character)

Input 3: "WELCOME!1"
Output: Weak Password  (No lowercase letter)

 */

import java.util.function.Predicate;

class Main{

    public static void main(String[] args) {
        
        Predicate<String> p = s->{

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for(char c:s.toCharArray()){

                if(Character.isUpperCase(c)) hasUppercase =true;
                if(Character.isLowerCase(c)) hasLowercase = true;
                if(Character.isDigit(c)) hasDigit = true;
                if(!(Character.isLetterOrDigit(c))) hasSpecial = true;
            }

            return hasUppercase && hasLowercase && hasDigit && hasSpecial && s.length()>=8;
        };

        boolean check = p.test("Nakul1932@");

       if(check){

        System.out.println("Strong Password");
       } else{

        System.out.println("not a strong password");
       }
    }
}