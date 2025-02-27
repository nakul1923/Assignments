/*
 * Program to implement Fuction
 */

import java.util.function.*;

class Main{

    public static void main(String[] args) {
        
        Function<String,Integer> obj = i->i.length();

        System.out.println(obj.apply("prakash"));
    }
}