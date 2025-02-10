/*

WAP to print tables of all the numbers between two entered numbers

 */

import java.util.Scanner;

public class pr47 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
    
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            System.out.println("multiplication table of " + n1 );
           
            for(int i = 1 ; i<=10 ; i++){

            

                
                System.out.printf("\t" + n1 + "*" + i + "=" + n1 * i );
                System.out.println();
            }
            
        }


    }
}