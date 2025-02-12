/*
 * 
 * Program to implement LinkedHashSet
 */


import java.util.LinkedHashSet;

class Main{

    public static void main(String[] args) {
        
        LinkedHashSet<String> l = new LinkedHashSet<>();

        l.add("abc");
        l.add("xyz");
        l.add("www");
        l.add("abc");

        System.out.println(l);
    }
}