/*
 * Problem without Stream
 */

import java.util.ArrayList;

class Main{

    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
 
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);

        for(Integer e:l){

            if(e%2==0){

                even.add(e);
            }
        }

        System.out.println(even);

    }
}