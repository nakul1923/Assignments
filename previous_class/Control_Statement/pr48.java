/*

WAP to find out the factors of all the numbers between two entered numbers

 */

import java.util.Scanner;

public class pr48 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
    
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            System.out.printf("Factors of " + n1 + " : " );
           
            for(int i = 1 ; i<=n1 ; i++){

                if(n1%i==0){

                    System.out.printf( i + ", ");
                }

            
          }

          System.out.println();
    }
}

}