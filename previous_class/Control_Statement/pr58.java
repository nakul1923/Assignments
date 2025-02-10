/*

WAP to convert decimal to binary

 */

import java.util.Scanner;

public class pr58 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number : ");
        int n = sc.nextInt();

        int num = n ;

        int sum  = 0 ;
        int toBinary = 0 ;

        while(n>0){

            int rem ;
            
            rem = n%2;

            sum = (sum * 10) + rem ;

            n = n/2 ;

            
        }

        while(sum>0){

            int rem ;

            rem = sum%10 ;

            toBinary = (toBinary * 10) + rem ;

            sum = sum/10 ;
        }
        
        System.out.println("Decimal = " + num + "\nBinary = " + toBinary);

        }
    }
    

