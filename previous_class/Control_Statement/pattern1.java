/*
 * WAP to print star by taking user input
 */

import java.util.Scanner;
public class pattern1 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            System.out.printf("*");
        }
        System.out.println();
    }

}
