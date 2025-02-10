/*

1
01
101
0101
10101

 */

import java.util.Scanner;
public class pattern12 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            char alpha = 'a';

            for(int j = 1 ; j<=i; j++ ){

                System.out.print(alpha);

                alpha++;

            }

            System.out.println();

        }
        
    }

}