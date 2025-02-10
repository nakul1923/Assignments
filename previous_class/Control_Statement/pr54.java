/*

WAP to find out all the even numbers between two entered numbers

 */

import java.util.Scanner;

public class pr54 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
        System.out.printf("All the even numbers between " + n1 + " & " + n2 + " are " );
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

           
            if(n1%2==0){

                System.out.printf(n1 + ", " );
            }
            
            
        }
    }

}