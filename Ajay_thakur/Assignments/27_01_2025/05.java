/*
 * Validating Email Address and Handling Custom Exceptions

Write a program to validate an email address and display appropriate exceptions if any errors are encountered.
Create 3 custom exception classes as below
1.	DotException
2.	AtTheRateException
3.	DomainException
A typical email address should include a '.' character, '@' character, and a valid domain name. Valid domain names for practice include 'in', 'com', 'net', or 'biz'.
Input format :
The first line of input contains the email to be validated.
Output format :
Print 'Valid email address' if the email address provided meets the criteria, or 'Invalid email address' along with the appropriate exception message. Display 'Invalid Dot usage', 'Invalid @ usage', or 'Invalid Domain' messages based on the email ID provided.
Refer to the sample output for reference.
Sample test cases :
Input 1 :
sample@gmail.com
Output 1 :
Valid email address
Input 2 :
sample@gmail.com.

 */

import java.util.*;

class DotException extends RuntimeException{

    DotException(String str){

        super(str);
    }

}

class AtTheRateException extends RuntimeException{

    AtTheRateException(String str){

        super(str);
    }

}

class DomainException extends RuntimeException{

    DomainException(String str){

        super(str);
    }

}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Email");
        String email = sc.nextLine();

        int countAtRate = 0;

        for(int i=0; i<email.length();i++){

            if(email.charAt(i)=='@'){

                countAtRate ++;
            }
        }

        if((countAtRate==1)&&(email.contains("."))&&(email.contains(".com")||email.contains(".in")||email.contains(".net")||email.contains(".biz"))){

            System.out.println("Valid Email");
        } else{

            if(countAtRate!=1){

                throw new AtTheRateException("invalid @ usage");
            }
            if(email.contains(".")==false){

                throw new DotException("Invalid . usage ");
            } 
            if(email.contains(".com")==false||email.contains(".in")==false||email.contains("net")==false||email.contains("biz")==false){

                throw new DomainException("Invalid Domain");
            }
        }

    }
}