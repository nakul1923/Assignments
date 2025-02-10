/*

WAP to find out all the strong numbers between two entered numbers

 */

import java.util.Scanner;

public class pr53 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();
          
        System.out.printf("Strong numbers between " + n1 + " & " + n2 + " are " );
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            int num = n1 ;
            int rem ;

            int sum = 0 ;
           
            while(num>0){
                int mul = 1 ;
                rem = num%10 ; 

                for(int i = 1; i<=rem; i++){
                    mul = mul * i;
                }
                
                sum = sum + mul ;
                num = num/10 ;
            }

            if(sum==n1){
                System.out.printf(n1 + ", " );

            }
        }
    }

}