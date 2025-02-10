/*

1
22
333
4444
55555

 */

import java.util.Scanner;
public class pattern9 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            for(int j = 1 ; j<=i; j++ ){

                System.out.print(j);
            }

            System.out.println();

        }
        
    }

}
