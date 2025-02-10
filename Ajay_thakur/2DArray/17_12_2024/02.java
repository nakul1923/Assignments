/*
 * Program to take array size and elements from user of 2D array
 */

import java.util.Scanner;

class Demo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows and columns of array");

        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];

        System.out.println("enter elements of array ");

        for(int i = 0; i<r ; i++){

            for(int j= 0 ; j<c ; j++){

                a[i][j] = sc.nextInt();
            }

        }

        for(int i = 0; i<r ; i++){

            for(int j= 0 ; j<c ; j++){

                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}
