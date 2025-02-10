/*
 * WAP to check if a given string contain special character or not
 */

 import java.util.*;

 class Main{
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Enter your Password");
 
         String s = sc.nextLine();

         int uppercase = 0;
         int lowercase = 0;
         int numeric = 0;
         int special = 0;
         int length = 0;

         if(s.length()>=8&&s.length()<=15){

            length = 1;
         }

         for(int i=0; i<s.length();i++){

            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){

                lowercase = 1;
            }

            if(s.charAt(i)>='A'&&s.charAt(i)<='z'){

                uppercase = 1;
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){

                numeric = 1;
            }
            if(s.charAt(i)=='@'||s.charAt(i)<='#'||s.charAt(i)<='$'||s.charAt(i)<='!'){

                special = 1;
            }
            
         }

         if(length==1&&lowercase==1&&uppercase==1&&special==1&&numeric==1){

            System.out.println("Valid Password");
         } else{

            System.out.println("Invalid Password");
         }
        

     }
    
    }