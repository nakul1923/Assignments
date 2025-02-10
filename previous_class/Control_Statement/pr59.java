/*

WAP to find out the sum of all integar between 100 and 200 which are divisible by 9

 */

public class pr59 {
    public static void main(String args[]){

        int sum = 0 ;

        for(int i = 101; i<200; i++){
        
            if(i%9==0){
                
                sum = sum + i ;
            }
        }
            System.out.println("the sum of all numbers between 100 and 200 that are divisible by 9 is  " + sum);
     }

       
 }
    

