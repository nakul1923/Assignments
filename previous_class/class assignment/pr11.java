/*
 * WAP to check season
 */

import java.util.Scanner;

public class pr11 {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter month name to know the season : ");
        String month = sc.next();
        

        switch(month){
            case "november" :
            
            case "december" : 
            
            case "january" : 
            
            case "ferbuary" : System.out.println("winter");
            break;
            case "march" : 
            
            case "april" : 
            
            case "may" : 
        
            case "june" : System.out.println("summer");
            break;
            case "july" :
            
            case "august" : 
            
            case "september" : 
            
            case "october" : System.out.println("rainy");
            break;
            
            default : System.out.println("month is not valid");
        }
    }
}
