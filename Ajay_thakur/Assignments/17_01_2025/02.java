/*
 * WAP to check our string contain uppercase character or not
 */

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your girlfriend name here you can use uppercase and Lowercase \nJaisi aapki marzi ho wesa naam daldo agar girlfriend nahi hai to biwi ka naam daldo");

        String s = sc.nextLine();

        int flag = 0;

        for(int i = 0 ; i<s.length(); i++){

            if(Character.isUpperCase(s.charAt(i))){

                flag = 1;
                break;
            }
        }

        if(flag==1){

            System.out.println("contains uppercase character");
        }
        else{
            System.out.println("does not contain uppercase character");
        }
        
    }
}