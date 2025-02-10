/*
 * WAP to build calculator using do while and switch case and ask user 
 */

import java.util.Scanner;
class pr4{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice,choice1,sum=0,amt,q,r;

        do{

            System.out.println("Enter your choice = ");
            System.out.println("1. Breakfast \n2.Lunch \n3.Dinner");
            choice = sc.nextInt();
            
            switch(choice){

                case 1 : {
                    System.out.println("Enter No. of breakfast packets");
                    q = sc.nextInt();
                    amt = q * 40 ;
                    System.out.println("your total amount" + amt);
                    sum = sum + amt ;
                } 

                break;

                case 2 : {
                    System.out.println("Enter No. of Lunch packets");
                    q = sc.nextInt();
                    amt = q * 120 ;
                    System.out.println("your total amount" + amt);
                    sum = sum + amt ;
                } 

                break;

                case 3 : {
                    System.out.println("Enter No. of Dinner packets");
                    q = sc.nextInt();
                    amt = q * 200 ;
                    System.out.println("your total amount" + amt);
                    sum = sum + amt ;
                } 

                break;

                

            }

            System.out.println(" Do u want to continue .... press 1 ");
            choice1 = sc.nextInt();


        }while(choice1==1);

        System.out.println("Total net ammount is " + sum);
    }
}