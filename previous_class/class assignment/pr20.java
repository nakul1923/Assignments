/*
 * Odd / Even
 */

import java.util.Scanner;
public class pr20 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = n%10;
       
        
        
            if(l%2==0){

                System.out.println("even");

            
            } else {
                System.out.println("odd");
            }


        
    }
}
 