/*

WAP to find out the sum of all the digits of an number

 */

import java.util.Scanner;

public class pr45 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem ;
        int sum = 0 ;
        
        while(n>0){

            rem = n%10 ;
            
            sum = sum + rem ;
            
            n = n/10;
            
        }

        System.out.printf("The sum of all digits of given no; is " + sum);

    }
}