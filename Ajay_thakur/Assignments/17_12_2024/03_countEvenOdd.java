 /*
 * WAP to count even and odd in 2D array
 */

import java.util.Scanner;

class Demo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows and columns of array");

        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int a[][] = new int[r][c];


        int countEven = 0 , countOdd = 0 ; 


        System.out.println("enter elements of array ");

        for(int i = 0; i<r ; i++){
            for(int j= 0 ; j<c ; j++){

                a[i][j] = sc.nextInt();
            }

        }
        

        for(int i = 0 ; i<r; i++){

            for(int j = 0 ; j<c ; j++){

                if(a[i][j]%2==0){

                    countEven++;
                } else{

                    countOdd ++ ;
                }
                
            }

            
        }

        System.out.println("the count of even number in array is " + countEven);
        System.out.println("the count of odd number in array is " + countOdd);

        
    }
}
