/*
 * WAP to square all elements of an array
 */

import java.util.Scanner;
class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        int y = sc.nextInt();

        int arr[] = new int[y];

        System.out.println("Enter elements");

        for(int i = 0 ; i<y ; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<y ; i++){

            arr[i] = arr[i] * arr[i];

            System.out.print(arr[i] + ", ");

        }

           
    }

}

