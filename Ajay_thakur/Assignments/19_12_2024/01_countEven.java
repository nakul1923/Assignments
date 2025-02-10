/*
 * 
 * WAP to read a number from user and check and count how many even number digits are there
 */

 import java.util.Scanner;

class Demo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");

        int num = sc.nextInt();
        int n = num ;
        int rem;
        int count = 0 ;
        while(n>0){

            rem = n%10;

            if(rem%2==0){

                count++;
                
            }

            n = n/10 ;

        }

        System.out.println("there are total " + count + " even number present in this number");
        
    }
}
