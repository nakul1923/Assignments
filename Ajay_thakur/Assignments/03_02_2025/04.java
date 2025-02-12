/*
 *  Modify an ArrayList
Objective: Develop a program to perform operations on an ArrayList.
Tasks:
Add 5 integers to an ArrayList.
Replace the second element with a new integer.
Remove the third element.
Display the updated ArrayList.

 */

import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(20);

        list.set(1, 25);
        list.remove(2);

        System.out.println(list);
    }
}