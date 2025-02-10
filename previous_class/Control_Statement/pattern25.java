/*

5
54
543
5432
54321

 */

import java.util.Scanner;
public class pattern25 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=5; i>=1; i--){


            for(int j = 5 ; j>=i; j--){

                System.out.print(j); 
                            
            }

            System.out.println();

        }
        
    }

}