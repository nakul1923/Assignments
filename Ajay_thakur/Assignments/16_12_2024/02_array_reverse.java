/*
 * WAP to reverse an array
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

        for(int i=0; i<y/2 ; i++){

            int temp = arr[i];

            arr[i] = arr[arr.length-1-i];

            arr[arr.length-1-i] = temp;

            }

        

        System.out.println("reverse array : ");

        for(int i = 0 ; i<y ; i++){

            System.out.print(arr[i] + ", ");
        }

    }

}
