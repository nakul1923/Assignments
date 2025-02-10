/*
 * WAP to print smallest among 10 numbers
 */

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i =1 ;

        System.out.println("enter a no");
        int min = sc.nextInt();
        while(i<=10){
            System.out.println("enter a no");
            n = sc.nextInt();
            if(n<min){
                
                min = n;
            }

            i++;
        }
        System.out.println("smallest Number = " + min);
    }
}
