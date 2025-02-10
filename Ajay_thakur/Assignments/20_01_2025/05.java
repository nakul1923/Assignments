/*
 5. Question: Remove all special characters from a string using String.

Input:

Enter a string: Hello@World#2025!

Output:

String without special characters: HelloWorld2025
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.replaceAll("@", "");
        str = str.replaceAll("#", "");
        str = str.replaceAll("!", "");
        str = str.replaceAll("$", "");

        System.out.println(str);
    }
}