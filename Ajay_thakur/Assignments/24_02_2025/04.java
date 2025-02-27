/*
 * Write a Function<String, String> to reverse a given string.

 */

import java.util.function.Function;

class Main{

    public static void main(String[] args) {
        
        Function<String,String> f = s->{

            StringBuilder sb = new StringBuilder(s);
            String rev = new String(sb.reverse());

            return rev;
        };

        System.out.println(f.apply("I Love Coding"));
    }
}