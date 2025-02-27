/*
 * Filter Positive Numbers
Task:

Create a list of integers (both positive and negative).
Use Stream API to filter and display only positive numbers.

 */

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

class Main{

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(-29);
        al.add(-30);
        al.add(45);
        al.add(56);
        al.add(-65);

        List<Integer> l = al.stream().filter(x->x>0).collect(Collectors.toList());

        System.out.println(l);

    }
}