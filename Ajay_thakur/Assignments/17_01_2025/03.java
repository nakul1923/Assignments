/*
 * WAP to check our string contain lowercase or not
 */

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your girlfriend name here you can use uppercase and Lowercase \nJaisi aapki marzi ho wesa naam daldo agar girlfriend nahi hai to biwi ka naam daldo");

        String s = sc.nextLine();

        int flag = 0;

        for(int i = 0 ; i<s.length(); i++){

            if(Character.isLowerCase(s.charAt(i))==true){

                flag = 1;
                break;
            }
        }

        if(flag==1){

            System.out.println("contains Lowercase character");
        }
        else{
            System.out.println("does not contain Lowercase character");
        }
        
    }
}