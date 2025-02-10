/*
 * WAP to print table of a number of users input
 */

import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no to print table");
        int n = sc.nextInt();
        int i = 1; 
        System.out.println("____________Table of " + n + "____________\n");

        while(i<=10){

            System.out.println(n + " x " + i + " = " + i*n);
            i++;
        }
    }
}
