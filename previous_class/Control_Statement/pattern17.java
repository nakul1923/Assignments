/*

*
##
***
####
*****

 */

import java.util.Scanner;
public class pattern17 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){


                if(i%2!=0){
                    for(int j=1; j<=i; j++){

                        System.out.print("*");
                    }
                } else{

                    for(int k = 1; k<=i; k++){

                        System.out.print("#");

                    }
                    

                }

                System.out.println();

        }
        
    }

}
