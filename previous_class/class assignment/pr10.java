/*
 * WAP to reverse a four digit number and find the sum of its digits
 */

import java.util.Scanner;

public class pr10 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum;
        int f,s,t,l;
        int rev;

        if(n<10000 && n>9){
            f = n/1000 ;
            s= (n/100 ) % 10 ;
            t = (n/10) %10 ;
            l = n%10;
            sum = f + s+t+l;
            rev = l * 1000 + t*100 + s*10 + f ;
            System.out.println("reverse is  " + rev);
            System.out.println("sum of all digit is  " + sum);

        } 
        

    }
}
 