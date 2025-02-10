/*
 * checking age for voting
 */

import java.util.Scanner;
public class pr21 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age to check vote eligibility");
        int age = sc.nextInt();
       
        
        
            if(age>=18){

                System.out.println("you can vote");

            
            } else {
                System.out.println("you can not vote");
            }


        
    }
}
 