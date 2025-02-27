/*
 * program to implement BiPredicate
 * 
 * BiPredicate will receive two parameters and return boolean 
 */

import java.util.function.BiPredicate;

class Main{

    public static void main(String[] args) {
        
        BiPredicate<Integer, Integer> p = (a,b)->(a+b)%2==0;

        System.out.println(p.test(10, 20));
    }
}