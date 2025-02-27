/*
 * Write a Function<Double, Double> to convert kilometers to miles (1 km = 0.621 miles).

 */

import java.util.function.Function;

class Main{

    public static void main(String[] args) {
        
        Function<Double,Double> f = i->i*0.621371;

        System.out.println(f.apply(10.0));
    }
}