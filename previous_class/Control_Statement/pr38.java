/*

WAP to check whether entered number is armstrong or not

 */


import java.util.Scanner;

public class pr38 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n ;
        int rem ;
        int sum = 0 ;
        int cube ;
        
        while(n>0){
            
            rem = n%10 ;
            cube = rem * rem * rem;
            sum = sum + cube ;
            n = n /10 ;
        }

        if(num==sum){
            System.out.println(num + " is armstrong number");
        } else{
            System.out.println(num + " is not armstrong number");
        }

    }
}
 