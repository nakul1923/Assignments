/*
 * WAP to check if a given string contain special character or not
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your girlfriend name");

        String s = sc.nextLine();

        int flag = 0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='$'||s.charAt(i)=='@'||s.charAt(i)=='#'){

                flag = 1;
                break;

            }
        }

        if(flag==1){

            System.out.println("given String contain Special character");
        } else{

            System.out.println("not present");
        }

        
    }
}