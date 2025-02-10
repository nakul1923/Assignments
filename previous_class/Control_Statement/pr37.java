/*

WAP to check whether entered number is palindrome or not

 */

import java.util.Scanner;

public class pr37 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rem ;
        int sum = 0 ;
        
        while(n>0){
            
            rem = n%10 ;
            sum = sum *10 + rem ;
            n = n /10 ;
        }

        if(num==sum){
            System.out.println(num + " is palindrome");
        } else{
            System.out.println(num + " is not palindrome");
        }
        

    }
}
 