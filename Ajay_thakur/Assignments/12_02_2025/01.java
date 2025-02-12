/*
 * Unique Student Roll Numbers

A college maintains a list of unique student roll numbers. These roll numbers should be stored in sorted order.

 */


import java.util.*;

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of Roll Numbers you want to add " );
        int num = sc.nextInt();
        
        System.out.println("Enter all the Roll Numbers");

        TreeSet<Integer> t = new TreeSet<>();

        for(int i = 0; i<num; i++){

            t.add(sc.nextInt());
        }

        System.out.println(t);
        
    }
}