import java.util.Scanner;
public class pra {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your requirement..for comparison");
        int it=sc.nextInt();
        int sumeven = 0,sumodd = 0;
        int i =0,n;
        
        while(i<=it){

           System.out.println("enter a no.");
           n = sc.nextInt();
            
           if(n%2==0){
            sumeven = sumeven +n;
           } 
           else{
            sumodd = sumodd +n;
           }
           
           i++;
        }

        System.out.println("sum of all even no is " + sumeven);
        System.out.println("sum of all odd no is " + sumodd);
     }}
    
