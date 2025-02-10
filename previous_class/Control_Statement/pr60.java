/*

WAP to print square, cube and square root of all numbers from 1 to N

 */

import java.util.Scanner;
public class pr60 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();


        System.out.println("");

        for(int i = 1; i<=n; i++){
        
            int square = 1 ;
            int cube = 1 ;
            int squareroot = 1 ;

            System.out.println("Number = " + i + ", square = " + i*i + ", cube = " + i*i*i + ", square root = " + Math.sqrt(i));
            
        }
            
     }

       
 }
    

