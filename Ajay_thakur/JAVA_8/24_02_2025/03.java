/*
 * Program to implement Consumer
 */

import java.util.function.*;

class Main{

    public static void main(String[] args) {
        
        Consumer<String> c = s->System.out.println(s);

        c.accept("hello");
    }
}