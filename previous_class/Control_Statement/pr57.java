/*

WAP to print all the prime numbers between two entered numbers

 */

import java.util.Scanner;

public class pr57 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
        System.out.printf("All prime numbers between " + n1 + " & " + n2 + " are " );
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            boolean isPrime = true ;

            for(int i = 2; i<=n1/2 ; i++){

                if(n1%i==0){

                    isPrime = false;
                    break ;
                } 
            
            }

            if(isPrime==true){
                
                System.out.printf(n1 + ", ");
            
            }
            
        }
    }
    

}