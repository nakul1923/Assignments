/*
 * WAP to print reverse of a number and sum of its digits
 */

import java.util.Scanner;

public class pr2 {
    public static void main(String args[]){

        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem ;
        int sum = 0 ;
        int add = 0 ;
        
        while(n>0){
            
            rem = n%10 ;
            add = add + rem ;
            sum = sum *10 + rem ;
            n = n /10 ;
        }

        System.out.println("sum is " + add);
        System.out.println("reverse order is " + sum);

    }
}
 