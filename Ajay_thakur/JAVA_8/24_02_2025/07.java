/*
 * Program to implement BiFunction
 */

import java.util.function.BiFunction;

class Main{

    public static void main(String[] args) {
        
        BiFunction<Integer,Integer,Integer> p = (a,b)->a*b;

        System.out.println(p.apply(11, 22));
    }
}