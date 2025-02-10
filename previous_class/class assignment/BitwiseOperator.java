/*
 * WAP to implement bitwise operator
 */

import java.util.Scanner;

class pr4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first no. : ");

        int n1 = sc.nextInt();

        System.out.println("Enter second no. : ");

        int n2 = sc.nextInt();

        int oper1 = n1&n2 ;

        int oper2 = n1|n2 ;

        int oper3 = n1^n2 ;



        

        System.out.println(oper1);
        System.out.println(oper2);
        System.out.println(oper3);


        
}

}