/*
 * WAP to print 0 1 1 2 3 5 8 13 21
 */

import java.util.Scanner;

class pr1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. : ");

        int n = sc.nextInt();

        int ft = 0 ;
        int st = 1 ;
        

        for(int i=1 ; i<=n ; ++i){

            System.out.printf(ft + ", ");
            int nt = st + ft ;
            
            ft = st ;
            st = nt ;
           
        }
    }
}