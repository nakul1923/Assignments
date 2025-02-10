package p2;

import p1.RBI;
import p1.Test1;

public class Test3 implements RBI{

    public Test3(){

        System.out.println("this is test3");
    }

    public void display3(){

        Test1 obj1 = new Test1();

        // System.out.println(obj1.a);           Error bcoz a is private and we cannot access it in another class
        // System.out.println(obj1.b);           Error bcoz b is default and we cannot use it in another package
        // System.out.println(obj1.c);           Error bcoz c is protected and we need child class for accessing it
        System.out.println(obj1.d);

        System.out.println("this is display3 of test3");
    }

    public void roi(){

        System.out.println("roi");
        
    }
}