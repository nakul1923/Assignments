/*

9 99 999 9999 99999 

 */


import java.util.Scanner;

public class pr31 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            
            for(int j=1; j<=i; j++){

                System.out.printf("9");
            }
            System.out.printf(" ");
        }
        

    }
}
 