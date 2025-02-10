/*

WAP to find out the sum of first and last digit of a number

 */

import java.util.Scanner;

public class pr46 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld ;
        int fd = n ;

        ld = n%10;

        int sum;
        
        
        while(fd>9){

            fd = fd/10;
            
        }

        sum =  fd + ld ; 

        System.out.printf("The sum of first and last digit of given no; is " + sum);

    }
}