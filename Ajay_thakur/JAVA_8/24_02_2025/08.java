/*
 * program to implement BiConsumer
 */

import java.util.function.*;

class Main{

    public static void main(String[] args) {
        
        BiConsumer<Integer,Integer> p = (a,b)->System.out.println(a+b);

        p.accept(10, 20);

    }
}