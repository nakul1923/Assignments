/*
 * WAP to print sum of all array elements
 */

import java.util.Scanner;
class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        int y = sc.nextInt();

        int arr[] = new int[y];

        int sum = 0 ;

        System.out.println("Enter elements");

        for(int i = 0 ; i<y ; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<y ; i++){

           sum += arr[i];

        }

        System.out.println("the sum of all elements is =" + sum);
           
    }

}