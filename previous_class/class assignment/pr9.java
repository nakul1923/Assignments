/*
 * WAP to reverse a three digit number
 */

import java.util.Scanner;

public class pr9 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum;
        int rev;
        int f, l,m,ml;

        if(n<1000 && n>9){
            f = n/100;
            l = n%10;
            m = (n/10) % 10;
            
            rev= (l * 10 + m)*10 + f;
            System.out.println("reverse " + rev);

        } 
        

    }
}
 