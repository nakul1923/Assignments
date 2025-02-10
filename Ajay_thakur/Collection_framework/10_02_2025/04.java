/*
 * Program to implemet Set and HashSet
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        HashSet<String> h = new HashSet<String>();

        h.add("katappa");
        h.add("hello");
        h.add("bye");
        h.add("katappa");
        h.add("katappa");

        System.out.println(h);

        Iterator itr = h.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }
    }
}