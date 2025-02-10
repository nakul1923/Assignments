/*

1
12
123
1234
12345

 */

import java.util.Scanner;
public class pattern8 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            for(int j = 1 ; j<=i; j++ ){

                System.out.printf("*");
            }

            System.out.println();

        }
        
    }

}
