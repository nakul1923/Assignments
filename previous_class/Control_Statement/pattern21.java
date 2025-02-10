/*

1
22
3 3
4  4
55555


 */

import java.util.Scanner;
public class pattern21 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){


            for(int j = 1 ; j<=i; j++ ){

                if(j==1 || j==i){
                    System.out.print(i);
                } else if(i==n){
                    System.out.print(i);
                } else {
                    System.out.printf(" ");
                }
            }

            System.out.println();

        }
        
    }

}