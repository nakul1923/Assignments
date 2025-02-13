/*
 * In this program we are sorting ArrayList with the help of Collections class
 */

import java.util.ArrayList;
import java.util.Collections;


class Main{


    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<Integer>();

        l.add(10);
        l.add(20);
        l.add(5);
        l.add(8);

        System.out.println(l);

        Collections.sort(l);

        System.out.println(l);
    }
}