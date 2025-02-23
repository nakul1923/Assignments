/*
 * Program to implement Hashtable
 */

import java.util.Hashtable;

class Main{

    public static void main(String[] args) {
        
        Hashtable<String,Integer> m = new Hashtable<>();

        m.put("abc", 76656);
        m.put("xyz", 756546);
        m.put("www", 8765);
        m.put("katappa", 98575);
       // m.put(null, 87374);                    gives error bcoz we cannot give null values or keys to Hashtable
        System.out.println(m);
    }
}