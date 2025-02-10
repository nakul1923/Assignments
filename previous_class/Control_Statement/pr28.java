/*

1 2 3 4  Hello 6 7 8 9  Hello 

 */


import java.util.Scanner;

public class pr28 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        

        while(i<=n){

        
            
            if(i%5==0){

                System.out.printf(" Hello ");

                i++;
            } else{
                System.out.printf(i + " ");
                
                i++;
            }


        }
    }
}
 