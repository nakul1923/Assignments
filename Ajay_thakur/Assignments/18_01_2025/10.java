/*
 * WAP to convert all the vowels into upper case present in a string
 */

import java.util.*;

class Main{

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your girlfriend name");

    String s = sc.nextLine();

    char[] ch = s.toCharArray();

    for(int i = 0; i<ch.length; i++){

        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
            int num=(int)ch[i];
            num -=32;
            ch[i] = (char)num;

        }
        
    }

    String fin = String.valueOf(ch);

    System.out.println("Final String is " + fin);

    

}
}