/*

WAP to reverse all the numbers between two entered numbers

 */

import java.util.Scanner;

public class pr51 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
        System.out.printf("reverse numbers between " + n1 + " & " + n2 + " are " );
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            int num = n1 ;
            int rem ;

            int sum = 0 ; 
           
            while(num>0){

                rem = num%10 ; 
                sum = sum * 10 + rem ;
                num = num/10 ;
            }

            System.out.printf(sum + ", " );
        }
    }

}