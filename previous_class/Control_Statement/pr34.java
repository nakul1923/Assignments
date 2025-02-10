/*

WAP to check whether entered number is perfect or not

 */


import java.util.Scanner;

public class pr34 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i<n; i++){
            
            if(n%i==0){
                sum += i;
            }
        }
        if(n==sum){
            System.out.println("the given number is perfect");
        } else{
            System.out.println("the given number is not perfect");
        }
        

    }
}
 