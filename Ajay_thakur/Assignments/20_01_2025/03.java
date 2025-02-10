/*
 Replace all occurrences of a substring in a string using String.

Input:

Enter the main string: I love programming and programming is fun  
Enter the substring to replace: programming  
Enter the new substring: coding

Output:

Modified string: I love coding and coding is fun
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = "I love programming and programming is fun";

        String s1 = "programming";
        String s2 = "coding";

        str = str.replace(s1, s2);

        System.out.println(str);
    }

}