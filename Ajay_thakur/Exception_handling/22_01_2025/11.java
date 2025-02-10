/*
 * Experiment 1
 */

import java.util.*;
import java.io.*;

class A{

    int test1(){

        try{

            String str = null;
            int x = str.length();

        } catch(Exception e){

            return 30;
        }
        return 60;
        
    }

    
}

class Main{

    public static void main(String[] args) {
        
        A obj = new A();

        System.out.println(obj.test1());
    }
}