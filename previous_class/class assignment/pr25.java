/*
 * WAP to check whether a number is divisible by 3 or 5
 */

import java.util.Scanner;
public class pr25 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is divisble by 3 or 5");
        int n = sc.nextInt();

       
        
        
            if(n%3==0 || n%5==0){

                System.out.println("number is divisible");

            
            } else {
                System.out.println("number is not divisible");
            }


        
    }
}
 