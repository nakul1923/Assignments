/*
 * WAP to convert first character of every word into uppercase
 */

 import java.util.*;

 class Main{
 
 public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
 
     System.out.println("Enter your girlfriend name");
 
     String s = sc.nextLine();
 

     String[] singleWord = s.split(" ");

     for(int i = 0 ; i<singleWord.length; i++){

        String tem = singleWord[i];

        char[] ch = tem.toCharArray();

        if(ch[0]>='a'&&ch[0]<='z'){

            int num = (int)(ch[0]);

            num -= 32;

            ch[0] = (char)num;
        }

        

        singleWord[i] = String.valueOf(ch);

     }

     s = String.join(" ", singleWord);

     System.out.println("your new String : " + s);
 
 }
 }