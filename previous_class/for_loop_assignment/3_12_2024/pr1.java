/*
 * WAP to check prime number
 */

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :");
            int n =  sc.nextInt();
            int flag = 0;
            if(n==2){
                System.out.println("PRIME");
            } else{
                for(int i = 3 ; i<=n/2; i++){

                    if(n%i==0){
                        flag = 1;
                        break;
                    } 
                }

                if(flag==0){
                    System.out.println("PRIME");
                } else{
                    System.out.println("NOT PRIME");
                }
                
            }


        }
    }
}
