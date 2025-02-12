/*
 * In this program we customized the Sorting technique 
 * 
 * in this we change the sorting increasing to decreasing
 */

import java.util.*;

class MySorting implements Comparator{

    public int compare(Object o1,Object o2){

        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;

        if(i1<i2){

            return +1;

        } 
        else if(i1>i2){

            return -1;
        } else{

            return 0;
        }
    }
}

class Main{

    public static void main(String[] args) {
        
        
        TreeSet<Integer> t = new TreeSet<>(new MySorting());

        t.add(10);
        t.add(5);
        t.add(15);
        t.add(25);

        System.out.println(t);
    }
}