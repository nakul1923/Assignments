/*
 * Prime number check
 */

import java.util.Scanner;

class pr3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter the no. : ");

        int n = sc.nextInt();

        boolean b = true;

        for(int i=2; i<=n/2 ; i++){

            if(n%i==0){

                b = false;
                break;
                
            }

        }

       if(b==true){
        System.out.println("Prime");
       } else{
        System.out.println("not Prime");
       }

        
}

}