/*

a
bc
d f
g  j
klmno

 */

import java.util.Scanner;
public class pattern23 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char alpha = 'a';
        
        for(int i=1; i<=n; i++){


            

            for(int j = 1 ; j<=i; j++ ){

                if(j==1 || j==i){
                    System.out.print(alpha);
                } else if(i==n){
                    System.out.print(alpha);
                } else {
                    System.out.printf(" ");
                }
                alpha++;
            }

            System.out.println();
            

        }
        
    }

}