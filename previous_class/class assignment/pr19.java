/*
 * WAP to demonstrate ATM machine system
 */

import java.util.Scanner;

public class pr19 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Balance : ");
        int ab = sc.nextInt();
        System.out.println("Enter Withdraw Amount");
        int wa = sc.nextInt();

        if(wa>ab){
            System.out.println("Insufficient Funds");
        } else if(wa<=ab){
            if(wa%10==0){
                int nb = ab - wa ; 
                System.out.println("remaining amount : " + nb);
            } else{
                System.out.println("Invalid Denomination!");
            }
        }
        
        
    }
}
 