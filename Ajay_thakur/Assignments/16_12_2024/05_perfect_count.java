/*
 * WAP to count perfect no in an array
 */

import java.util.Scanner;

class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        int y = sc.nextInt();
    

        int arr[] = new int[y];

        System.out.println("Enter elements");

        int count = 0 ;

        for(int i = 0 ; i<y ; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<y ; i++){

            int sum = 0;

            for(int j = 1 ; j<=arr[i]/2 ; j++){

                if(arr[i]%j==0){

                    sum = sum + j ;
                } 
            }

            if(arr[i]==sum){

                count++;
            }

            }

            System.out.println("count of perfect no is " + count);

            
        
    }

}
