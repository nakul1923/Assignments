/*

WAP to count digits of a number

 */

import java.util.Scanner;

public class pr35 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        
        while(n>=10){
            n = n/10;
            count ++;
        }
        
        System.out.println("the total number of digits in given number is " + count);

    }
}
 