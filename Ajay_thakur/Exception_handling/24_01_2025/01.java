/*
 * for checked exceptions there is no auto-ducking. we need to perform process of ducking for this purpose we will use the keyword throws to perform ducking
 */

import java.util.*;
import java.io.*;

class A{

    void test1() throws FileNotFoundException
    {

        System.out.println("test1");
        test2();
    }

    void test2() throws FileNotFoundException{

        System.out.println("test2");
        test3();
    }

    void test3() throws FileNotFoundException{

        System.out.println("test3");
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.write("hello");
    }
}

class Main{

    public static void main(String[] args) {
        
        A obj = new A();

        try{

            obj.test1();
        } catch(FileNotFoundException rr){


        }
        System.out.println("done");
    }
}