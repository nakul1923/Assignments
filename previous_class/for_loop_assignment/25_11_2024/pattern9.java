/*
 
   1 
  1 1 
 1 2 1 
1 3 3 1 
  
 */

public class pattern9 {
    
    public static void main(String[] args) {
        
        for(int i = 0 ; i<4; i++){

            int num = 1;

            for(int j = 0 ; j<4-i-1; j++){

                System.out.print(" ");
            }

            for(int k = 0; k<=i; k++){

                System.out.print(num + " ");
                num = num * (i-k) / (k+1);
            }

            System.out.println();
        }
    }
}
