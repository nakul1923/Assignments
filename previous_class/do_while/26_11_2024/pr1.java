/*
 * WAP to build calculator using do while and switch case and ask user 
 */

import java.util.Scanner;
class pr1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,choice,n;

        do{

            System.out.println("Enter two no. = ");
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("press 1 for Addition \npress 2 for substraction \npress 3 for multiply \npress 4 for divide");
            n = sc.nextInt();

            switch(n){

                case 1 : System.out.println("sum is " + (a + b));
                break;

                case 2 : System.out.println("substraction is " + (a - b));
                break;

                case 3 : System.out.println("multiply is " + (a * b));
                break;

                case 4 : System.out.println("divison is " + (a / b));
                break;
            }

            System.out.println(" Do u want to continue .... press 1 ");
            choice = sc.nextInt();


        }while(choice==1);
    }
}