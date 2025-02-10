/*

WAP to reverse a number

 */


import java.util.Scanner;

public class pr36 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem ;
        int sum = 0 ;
        
        while(n>0){
            
            rem = n%10 ;
            sum = sum *10 + rem ;
            n = n /10 ;
        }

        System.out.println("the reverse order is " + sum);

    }
}
 