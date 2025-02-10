/*

*
**
*@*
*@@*
*****


 */

import java.util.Scanner;
public class pattern24 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){


            for(int j = 1 ; j<=i; j++ ){

                if(j==1 || j==i){
                    System.out.printf("*");
                } else if(i==n){
                    System.out.printf("*");
                } else {
                    System.out.printf("@");
                }
            }

            System.out.println();

        }
        
    }

}