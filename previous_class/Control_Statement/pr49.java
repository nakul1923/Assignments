/*

WAP to find out all the perfect numbers between two entered numbers

 */

import java.util.Scanner;

public class pr49 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
        System.out.printf("perfect numbers between " + n1 + " & " + n2 + " are " );
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            int sum = 0;
           
            for(int i = 1 ; i<n1 ; i++){

                if(n1%i==0){

                    sum = sum + i ;
                    
                }
                
            }

            if(sum==n1){
                
                System.out.printf( n1 + ", " );

            }
        }
    }

}