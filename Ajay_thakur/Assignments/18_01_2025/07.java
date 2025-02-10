/*
 * WAP to find the frequency of each character in a string
 */

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");

        String s = sc.nextLine();

        for(int i=0; i<s.length();i++){

            int count =  0;

            int flag = 0;

            char c = s.charAt(i);

            for(int k=i; k>0; k--){

                if(s.charAt(i)==s.charAt(k-1)){

                    flag = 1;
                }
            }

            if(flag==1){

                continue;
            }

            for(int j = i;j<s.length();j++){

                if(c==(s.charAt(j))){

                    count ++;
                }
            }

            System.out.println(s.charAt(i) + " = " + count);
            
            
        }

    }
}