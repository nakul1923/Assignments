/*

1
10
101
1010
10101


 */

import java.util.Scanner;
public class pattern18 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){


            for(int j = 1 ; j<=i; j++ ){

                if(j==1){
                    System.out.printf("0");
                } else{
                    System.out.printf("1");
                }
            }

            System.out.println();

        }
        
    }

}