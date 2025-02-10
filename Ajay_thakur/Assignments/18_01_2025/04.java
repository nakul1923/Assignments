/*
 * WAP to remove all spaces from a string
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your girlfriend name");

        String s = sc.nextLine();

        System.out.println(s.replaceAll(" ", ""));

        
    }
}
