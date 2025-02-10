/*
 * WAP to print superbazar bill till users choice & print amount for each item & 
 */

import java.util.Scanner;
public class pr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i,r,q,sum = 0,a,choice;
        
        do
        {
            
            System.out.println("Item no: ");
            i = sc.nextInt();

            System.out.println("Rate : ");
            r = sc.nextInt();

            System.out.println("Quantity : ");
            q = sc.nextInt();

            a = q*r ;

            System.out.println("Your total amount for " + i + " is " + a);

            System.out.println(" Do you want to add more items :  if yes press '1' ");
            choice = sc.nextInt();

            sum = sum + a ;
        }while(choice==1);

        System.out.println("Net amount is : " + sum);

    }
}
