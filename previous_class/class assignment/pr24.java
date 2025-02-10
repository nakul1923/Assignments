/*
 * WAP to check whether a number is divisible by 13 or 15
 */

import java.util.Scanner;
public class pr24 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is divisble by 13 or 15");
        int n = sc.nextInt();

       
        
        
            if(n%15==0 || n%13==0){

                System.out.println("number is divisible");

            
            } else {
                System.out.println("number is not divisible");
            }


        
    }
}
 