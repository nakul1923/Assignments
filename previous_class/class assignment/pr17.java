/*
 * WAP to print temperature 
 */

import java.util.Scanner;

public class pr17 {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter temperature : ");
        int c = sc.nextInt();

        if(c<0){
            System.out.println("Freezing");
        } else if(c>0 && c<15){
            System.out.println("Cold");
        } else if(c>15 && c<30){
            System.out.println("Warm");
        } else{
            System.out.println("Hot");
        }

    }
     
}