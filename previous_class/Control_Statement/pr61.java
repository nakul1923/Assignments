/*

WAP to find out all the leap years between two entered years

 */

import java.util.Scanner;

public class pr61 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first year : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second year : ");
        int n2 = sc.nextInt();
          
        System.out.printf("All the Leap years between " + n1 + " & " + n2 + " are " );
        
        for(int n3 = ++n1 ; n1<n2 ; n1++ ){

            boolean isLeapYear = false ;

            if(n1%4==0){

                isLeapYear = true ;

            } else if(n1%100==0){

                isLeapYear = true ;

            } else if(n1%400==0){

                isLeapYear = true ;

            }

            if(isLeapYear==true){
                
                System.out.printf(n1 + ", ");
            
            }

        }
            
    }
    
}

