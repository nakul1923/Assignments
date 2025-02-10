/*

WAP to count no. of even and odd digits in a number

 */


import java.util.Scanner;

public class pr40 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem ;
        int odd = 0;
        int even = 0;
        
        
        while(n>0){
            
            rem = n%10 ;
            
            if(rem%2==0){
                even++;
            } else{
                odd++;
            }
            n = n /10 ;
        }

        System.out.println("total odd digits = " + odd);
        System.out.println("total even digits = " + even);
    }
}