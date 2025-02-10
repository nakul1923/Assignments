/*

1
12
1 3
1  4
12345


 */

import java.util.Scanner;
public class pattern20 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){


            for(int j = 1 ; j<=i; j++ ){

                if(j==1 || j==i){
                    System.out.print(j);
                } else if(i==n){
                    System.out.print(j);
                } else {
                    System.out.printf(" ");
                }
            }

            System.out.println();

        }
        
    }

}