/*
 * WAP to reverse a string
 */

import java.util.*;
class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your girlfriend name and see it in reverse form");

        String s = sc.nextLine();

        char[] c = s.toCharArray();

        for(int i = 0; i<c.length/2; i++){

            char temp = c[i] ;

            c[i] = c[c.length-1-i];

            c[c.length-1-i] = temp;
        }

        s = String.valueOf(c);

        System.out.println("Reverse : " + s);
    }
}