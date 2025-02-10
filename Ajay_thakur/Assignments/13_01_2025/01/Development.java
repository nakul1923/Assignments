package com.calculate;

import com.math.*;

public class Development{

    public static void main(String[] args) {
        
        Add obj1 = new Add(10,20);

        obj1.add();

        Sub obj2 = new Sub(20,10);

        obj2.sub();

        Mul obj3 = new Mul(10,20);

        obj3.mul();

        Div obj4 = new Div(100,5);

        obj4.div();
    }
}