/*
 * Program to iterate HashMap
 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Main{

    public static void main(String[] args) {
        
        HashMap<String,Integer> m = new HashMap<>();

        m.put("abc ", 10234);
        m.put("xyz", 32453);
        m.put("www", 55334);
        m.put("katappa", 34654356);

        System.out.println(m);

        Set s = m.entrySet();

        Iterator itr = s.iterator();
        
        while(itr.hasNext()){

            Map.Entry m1 = (Map.Entry)itr.next();

            System.out.println(m1.getKey());
            System.out.println(m1.getValue());
        }

    

    }
}