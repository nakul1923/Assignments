/*
 * Password Strength Validator using Predicate and ArrayList
You are developing a password strength validation system using Predicate<String> in Java.
A password is considered strong if it meets the following conditions:
It must be at least 8 characters long.
It must contain at least one uppercase letter (A-Z).
It must contain at least one lowercase letter (a-z).
It must contain at least one digit (0-9).
It must contain at least one special character from the set { @, #, $, %, &, * }.
 Instructions:
Create a Java program that uses Predicate<String> to check if a given password is strong based on the above criteria.
Store multiple passwords in an ArrayList<String> and validate each password in the list.
Print whether each password is strong or weak based on the validation.


passwords = ["Hello@123", "hello123", "WELCOME!1", "Test@99", "Secure#2023"]
Output:
Strong Password: Hello@123
Weak Password: hello123
Weak Password: WELCOME!1
Weak Password: Test@99
Strong Password: Secure#2023
 */

import java.util.ArrayList;
import java.util.function.Predicate;

class Main{

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();

        al.add("Rohit2002@");
        al.add("nakul645#");
        al.add("nakuL@123");
        al.add("Nakul@2");
        al.add("1532425@");

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

        for(String s:al){

            if(p.test(s)){

                System.out.println("Strong : " + s);
            } else {

                System.out.println("Weak : " + s);
            }
        }
    }
}