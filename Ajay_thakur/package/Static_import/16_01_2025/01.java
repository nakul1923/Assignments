/*
 * 
 * in this program we imported all static members of System class 
 * and we didnt use System with out println
 * 
 * and also we use hello method of Alpha class with import keyword
 */

import static java.lang.System.*;
import static info.Alpha.*;
class Demo1{

    public static void main(String[] args) {
        
        out.println("hello guys");

        hello();
    }
}