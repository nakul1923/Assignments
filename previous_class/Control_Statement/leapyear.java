import java.util.Scanner;

public class leapyear {
    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
            if(n%4==0){

                System.out.printf(" leap year ");

            
            } else if(n%100==0){
                System.out.printf(" leap year ");
                
            
            } else if(n%400==0){
                System.out.printf(" leap year ");
            } else {
                System.out.printf(" not a leap year ");
            }


        
    }
}
 