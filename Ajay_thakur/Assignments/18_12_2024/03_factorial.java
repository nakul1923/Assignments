/*
 * WAP to read an array from user and display factorial of every element of array
 */

 import java.util.Scanner;

class Demo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");

        int s = sc.nextInt();

        int arr[] = new int[s];

        System.out.println("enter elements");

        for(int i = 0 ; i<s ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.print("factorial of all elements are ");

        for(int i = 0 ; i<s ; i++){

            int fact = 1 ;

            for(int j = 1 ; j<=arr[i]; j++){

                fact = fact * j ;
            } 

            System.out.print(fact + ", ");
        }


        
    }
}
