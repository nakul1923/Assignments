/*

WAP to print factorial of all the numbers between two entered numbers

 */

import java.util.Scanner;

public class pr56 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
        System.out.printf("All factors of numbers between " + n1 + " & " + n2 + " are " );
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            int mul=1 ;

            for(int i = 1; i<=n1 ; i++){

                mul = mul * i ;

            }

            System.out.printf(n1 + " = " + mul + ", ");
            
            
            
        }
    }
    

}