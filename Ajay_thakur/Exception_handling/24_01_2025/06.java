/*
gives error

 * in method overriding both the methods from child class and base class contains throws than as we go from base class to child class than child class overriding method can throw the same exception or sub class exception but cannot throw the super class exception 
 * 
 * in this we are decreasing 
 */

import java.io.FileNotFoundException;

class A{

    void test1() throws FileNotFoundException{


    }
}
class B extends A{

    void test1() throws Exception{                       //here we are decreasing


    }
}

class Main{

    public static void main(String[] args) {
        

        System.out.println("main");
    }
}