/*

WAP to check whether entered number strong or not

 */


import java.util.Scanner;

public class pr39 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n ;
        int rem ;
        int sum = 0 ;
        
        
        while(n>0){
            
            int mul = 1 ;
            rem = n%10 ;
            for(int i = 1; i<=rem; i++){
                mul = mul * i ; 
            }
            sum = sum + mul ;
            n = n /10 ;
        }

        if(num==sum){
            System.out.println(num + " is strong number");
        } else{
            System.out.println(num + " is not strong number");
        }

    }
}