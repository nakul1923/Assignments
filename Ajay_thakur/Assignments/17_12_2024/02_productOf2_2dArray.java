 /*
 * WAP to find product of all elements of 2D array
 */

import java.util.Scanner;

class Demo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows and columns of array");

        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];


        int mul = 1; 


        System.out.println("enter elements of first array ");

        for(int i = 0; i<r ; i++){
            for(int j= 0 ; j<c ; j++){

                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("enter elements of second array ");
        for(int i = 0; i<r ; i++){

            for(int j= 0 ; j<c ; j++){

                b[i][j] = sc.nextInt();
            }

        }

        for(int i = 0 ; i<r; i++){

            for(int j = 0 ; j<c ; j++){

                mul = mul * a[i][j] * b[i][j];
                
            }

            
        }

        System.out.println("the sum of all elements of 2 2D array is " + mul);

        
    }
}
