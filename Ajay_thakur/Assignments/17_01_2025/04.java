/*
 * WAP to check our string contain special character or not
 */

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Apki grielfriend ke naam ka password dalo \nAap usme special character bhi use kar sakte ho\nAapki marzi aap ko karna ho to karo");

        String s = sc.nextLine();

        int flag = 0;

        for(int i = 0 ; i<s.length(); i++){

            if(s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='$' || s.charAt(i)=='&' || s.charAt(i)=='*'){

                flag = 1;
                break;
            }
        }

        if(flag==1){

            System.out.println("contains Special character");
        }
        else{
            System.out.println("does not contain Special character");
        }
        
    }
}