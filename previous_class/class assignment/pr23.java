/*
 * WAP to check whether a number is divisible by 11 or not
 */

import java.util.Scanner;
public class pr23 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is divisble by 11 or not");
        int n = sc.nextInt();

       
        
        
            if(n%11==0){

                System.out.printf("number is divisible by 11");

            
            } else {
                System.out.printf("number is not divisible by 11");
            }


        
    }
}
 