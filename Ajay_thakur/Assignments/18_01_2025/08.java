/*
 * Valid Password or Not

The HR committee of Sunrise Basket Company decided to enforce the following rules when an employee creates/changes his/her password.

1.	Password should be less than 15 and more than 8 characters in length.
2.	Password should contain at least one upper case and one lower case alphabet.   
3.	Password should contain at least one number.
4.	Password should contain at least one special character.
5.	Password should not contain a space.

The program must accept a given password string "password" as input.
Input format :
The input consists of String that represents password.
Output format :
The output should print "<password> is a valid password" or "<password> is a invalid password".
Refer sample output for formatting specifications.
Sample test cases :
Input 1 :
Ex@1234ab
Output 1 :
Ex@1234ab is a valid password

 */

 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Enter your Password");
 
         String s = sc.nextLine();

         int uppercase = 0;
         int lowercase = 0;
         int numeric = 0;
         int special = 0;
         int length = 0;

         if(s.length()>=8&&s.length()<=15){

            length = 1;
         }

         for(int i=0; i<s.length();i++){

            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){

                lowercase = 1;
            }

            if(s.charAt(i)>='A'&&s.charAt(i)<='z'){

                uppercase = 1;
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){

                numeric = 1;
            }
            if(s.charAt(i)=='@'||s.charAt(i)<='#'||s.charAt(i)<='$'||s.charAt(i)<='!'){

                special = 1;
            }
            
         }

         if(length==1&&lowercase==1&&uppercase==1&&special==1&&numeric==1){

            System.out.println("Valid Password");
         } else{

            System.out.println("Invalid Password");
         }
        

     }
    
    }