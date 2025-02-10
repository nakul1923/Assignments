/*
 * WAP to calculate grade of a student and print total marks and average
 */

import java.util.Scanner;
public class pr22 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter physics marks");
        double phy = sc.nextInt();
        System.out.println("enter chemistry marks");
        double che = sc.nextInt();
        System.out.println("enter maths marks");
        double mat = sc.nextInt();
        System.out.println("enter english marks");
        double eng = sc.nextInt();
        System.out.println("enter hindi marks");
        double hin = sc.nextInt();

        double total = phy + che + mat + eng + hin ;

        double avg = total / 5 ;
        
        System.out.println("Total marks = " + total);
        System.out.println("Average marks = " + avg);
       
        
        
            if(avg>=90){

                System.out.printf("Grade A");

            
            } else if(avg>=80) {
                System.out.println("Grade B");
            }else if(avg>=70) {
                System.out.println("Grade C");
            }else if(avg>=60) {
                System.out.println("Grade D");
            }else if(avg>=50) {
                System.out.println("Grade E");
            } else{
                System.out.println("Fail ! ");
            }

        
    }
}