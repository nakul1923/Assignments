/*
 * not gives error because we are not decreasing
 */

import java.io.FileNotFoundException;

class A{

    void test1() throws Exception{


    }
}
class B extends A{

    void test1() throws FileNotFoundException{                      


    }
}

class Main{

    public static void main(String[] args) {
        

        System.out.println("main");
    }
}