/*
 * program to use instanceof 
 */

import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<String>();

        System.out.println(l instanceof ArrayList);
        System.out.println(l instanceof List);
        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof RandomAccess);
    }
}