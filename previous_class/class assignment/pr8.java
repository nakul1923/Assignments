/*
 * WAP to reverse a two digit number
 */

import java.util.Scanner;

public class pr8 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // int sum;
        int rev;
        int f, l;

        if(n<100 && n>9){
            f = n/10;
            l = n%10;
            rev= l * 10 + f;
            System.out.println("reverse " + rev);

        } 
        

    }
}
 