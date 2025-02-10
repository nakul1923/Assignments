/*

         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 
         
         

 */

public class pattern1 {
    
    public static void main(String[] args) {
        
        for(int i = 1 ; i<=10; i++){

            for(int j = i; j<10 ; j++){

                System.out.print(" ");
                
            }

            for(int k = 1; k<=i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i= 1 ;  i<=9 ; i++){

            for(int j = 1 ; j<=i ; j++){
                System.out.print(" ");
            }

            for(int k = i ; k<=9; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
