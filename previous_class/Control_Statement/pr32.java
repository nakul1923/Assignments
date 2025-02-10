/*

A b C d E f 

 */


import java.util.Scanner;

public class pr32 {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 65;
        int b = 98;
        int i = 1;
        
        while(i<=n){
            
            if(a%2!=0){
                System.out.printf((char)a + " ");
            
            }
            if(b%2==0){
                System.out.printf((char)b + " ");
            
            }
            a++;
            b++;
            i++;
        }
        

    }
}
 
