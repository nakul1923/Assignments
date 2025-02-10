/*
 * in this program we are asking to input password in which only one '@' is valid
 */

import java.util.*;

import java.io.*;

class AtRate extends RuntimeException{

    AtRate(String str){

        super(str);
    }
}

class Main{

    public static void main(String[] args) {
        
        int atrate = 0;
        System.out.println("main");
        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();

        for(int i=0;i<pass.length();i++){

            if(pass.charAt(i)=='@'){

                atrate++;
            }
        }

        if(atrate==1){

            System.out.println("valid");
        } else{

            throw new AtRate("Invalid password")
        }

        System.out.println("end");
    }
}