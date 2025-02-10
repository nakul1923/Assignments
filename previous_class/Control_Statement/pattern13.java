/*
 
1
23
456
78910
 
 */


import java.util.Scanner;
public class pattern13 {
    
    public static void main(String[] args) {

        System.out.println("enter the no : ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){


            for(int j = 1 ; j<=i; j++ ){

                int add = i + j;

                if(add%2==0){

                    System.out.printf("1");

                } else{
                    
                    System.out.printf("0");
                }

            }

            System.out.println();

        }
        
    }

}