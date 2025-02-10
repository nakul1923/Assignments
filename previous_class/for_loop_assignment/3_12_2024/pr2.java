/*
 * WAP to print all prime numbers between two entered numbers
 */

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number :");
            int n1 =  sc.nextInt();
            System.out.println("Enter second number :");
            int n2 =  sc.nextInt();
            
               
                for(int i = n1 ; i<=n2; i++){

                    int flag = 0;

                    for(int j = 2; j<i;j++){
                        if(i%j==0){
                            flag = 1;
                            break;
                        } 

                        
                        }
                        if(flag==0){
                            System.out.println(i);
                        }
                    
                }
                
            }


        }
    
}
