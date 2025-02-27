/*
 * Program to implement Function
 */

import java.util.function.*;

class Main{

    public static void main(String[] args) {
        
        Function<Integer,Integer> obj = i->i*i;

        System.out.println(obj.apply(10));
    }
}