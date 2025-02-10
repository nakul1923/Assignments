/*

*****
 ****
  ***
   **
    *
    **
    ***
    ****
    *****
    ******

 */


public class pattern7 {
    
    public static void main(String[] args) {
        
        
                
                for(int i = 1 ; i<=5; i++){
                    
                    for(int j= 1; j< i  ; j++){
                        System.out.print(" ");
                    }

                    for(int k = i ; k<=5 ; k++){

                        System.out.print("*");
                    }
                    System.out.println();
                }

                for(int i = 1 ; i<=5; i++){
                    for(int j = 1 ; j<=4 ; j++){

                        System.out.print(" ");
                    }
                    for(int k = 1; k<=i+1 ; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
}
        
    

