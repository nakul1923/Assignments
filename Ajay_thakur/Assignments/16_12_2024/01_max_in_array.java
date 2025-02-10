/*
 * WAP to find max number in an array
 */

import java.util.Scanner;
class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        int y = sc.nextInt();

        int arr[] = new int[y];

        System.out.println("Enter elements");

        int max = 0;

        for(int i = 0 ; i<y ; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<y ; i++){

            if(arr[i]>max){

                 max = arr[i];
            }

        }

        System.out.println("maximum element = " + max);



        
    }
}