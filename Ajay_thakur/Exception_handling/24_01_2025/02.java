/*
 * unchecked exceptions have auto-ducking
 */

import java.util.*;
import java.io.*;

class A{

    void test1() 
    {

        System.out.println("test1");
        test2();
    }

    void test2() {

        System.out.println("test2");
        test3();
    }

    void test3(){

        System.out.println("test3");
        // PrintWriter pw = new PrintWriter("abc.txt");
        // pw.write("hello");

        int a = 10/0;
    }
}

class Main{

    public static void main(String[] args) {
        
        A obj = new A();

        try{

            obj.test1();
        } catch(Exception rr){


        }
        System.out.println("done");
    }
}