/*
 * WAP to count even and odd numbers in an array
 */

import java.util.Scanner;
class Demo{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");

        int y = sc.nextInt();

        int arr[] = new int[y];

        System.out.println("Enter elements");

        int countEven = 0 , countOdd = 0 ;

        for(int i = 0 ; i<y ; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<y ; i++){

            if(arr[i]%2==0){

                countEven++;
            } else {

                countOdd++;
            }

            }

        

        System.out.println("even no. count is : " + countEven);
        System.out.println("odd no. count is : " + countOdd);

        

    }

}
