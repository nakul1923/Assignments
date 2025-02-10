/*
 * WAP to count prime number in an array
 */

import java.util.Scanner;
class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        int y = sc.nextInt();

        int arr[] = new int[y];

        System.out.println("Enter elements");

        int count = 0, flag = 1 ;

        for(int i = 0 ; i<y ; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<y ; i++){

            for(int j = 2 ; j<=arr[i]/2 ; j++){

                if(arr[i]%j==0){

                    flag = 0;
                    break;
                } 
            }

            if(flag == 1) {

                count++;
            }

            }

            System.out.println("count of prime no is " + count);

            

        
    }

}