/*
 * Replace all occurrences of a character in a string with another character.

Input: Original String: "banana"
Replace 'a' with 'o'
Expected Output: "bonono"

 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String s = sc.nextLine();

        System.out.println(s.replace("a","o"));
    }
}