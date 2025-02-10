/*
 * User define exception - with the help of throw keyword we can generate user define exception also. whenever we want to throw user define exception than the corresponding class must be child of runtime exception.
 */

import java.util.*;
import java.io.*;


class InvalidAge extends RuntimeException{

    InvalidAge(String str){

        super(str);
    }
}

class Main{

    public static void main(String[] args) {
        
        System.out.println("main");

        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(args[0]);

        if(age<10){

            throw new InvalidAge("Wrong Age");
        }

        System.out.println("end");
    }
}