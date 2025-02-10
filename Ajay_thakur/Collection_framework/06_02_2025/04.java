/*
 * Program to implement previous() methods
 */

import java.util.*;

class Main{

    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<>();

        l.add("rashmika");
        l.add("deepika");
        l.add("katappa");
        l.add("bahubali");
        
        System.out.println(l);

        ListIterator itr = l.listIterator();

        while(itr.hasNext()){

            String i = (String)itr.next();
            System.out.println(i);
        }
        
        while(itr.hasPrevious()){

            String i = (String)itr.previous();
            System.out.println(i);
        }

        System.out.println(l);
    }
}