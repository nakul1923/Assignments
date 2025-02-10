/*

* * * * * * * * * * * 
* * * * *   * * * * * 
* * * *       * * * * 
* * *           * * * 
* *               * * 
*                   * 
* *               * * 
* * *           * * * 
* * * *       * * * * 
* * * * *   * * * * * 
* * * * * * * * * * * 

 
 
 */

public class pattern3 {
    
    public static void main(String[] args) {
        
        for(int i = 0; i<6; i++){

            
                if(i == 0){
                    for(int j = 0 ; j<11; j++){
                        System.out.print("* ");
                    }
                    
                } 
                
                else{

                    for( int k=i; k<6; k++){
                        System.out.print("* ");
                    }
                    
                    for( int l = 1; l<=(i*2)-1 ; l++){
                        System.out.print("  ");
                    }

                    for(int m = i; m<6; m++){
                        System.out.print("* ");
                    }

                }
                
                
            

            System.out.println();
        }

        for(int i = 4; i>=0 ; i--){

            if(i==0){
                for(int j = 1; j<=11; j++)
                System.out.print("* ");
            }
            else{ 

                for(int j=4; j>=i-1; j--){
                    System.out.print("* ");
                }

                for(int k = 1 ; k<=i*2-1 ; k++){

                    System.out.print("  ");
                }
                for(int m = 4; m>=i-1 ; m--){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
