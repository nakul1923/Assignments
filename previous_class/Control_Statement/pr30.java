/*

1+11+111+1111+11111+

 */


import java.util.Scanner;

public class pr30                                                                   {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            
            for(int j=1; j<=i; j++){

                System.out.printf("1");
            }
            System.out.printf("+");
        }
        

    }
}
 