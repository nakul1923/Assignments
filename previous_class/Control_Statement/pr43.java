/*

WAP to convert binary number into decimal 

 */


import java.util.Scanner;

public class pr43 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rem ;
        int sum = 0 ;
        int i = 0;
        


        while(n>0){

            int mul ;
            rem = n%10 ;
            
            mul = (rem ) * ((int)Math.pow(2,i));
            
            sum = sum + mul;

            n = n/10;

            i++;
            
        }

        System.out.printf("Binary = " + num +"\n Decimal = " + sum);

    }
}