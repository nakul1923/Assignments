/*

A
BB
CCC
DDDD
EEEEE

 */

import java.util.Scanner;
public class pattern14 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        
        for(int i=1; i<=n; i++){


            for(int j = 1 ; j<=i; j++ ){

                System.out.print(num);

                num++;
            
            }

            System.out.println();

        }
        
    }

}