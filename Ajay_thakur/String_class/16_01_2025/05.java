/*
 * program to print String character by character
 */

 class Demo{

    public static void main(String[] args) {
        
        String s = "welcome home";

        for(int i = 0; i<s.length(); i++){

            // System.out.println(s[i]);                      Error bcoz we cannot use subscript with objects we can use it with arrays
            System.out.println(s.charAt(i));
        }
    }
}