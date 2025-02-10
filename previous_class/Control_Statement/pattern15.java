/*

a
bc
def
ghij
klmno

 */

import java.util.Scanner;
public class pattern15 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char alpha = 'A';
        
        for(int i=1; i<=n; i++){


            for(int j = 1 ; j<=i; j++ ){

                System.out.print(alpha);
            
            }

            alpha++;
            System.out.println();

        }
        
    }

}