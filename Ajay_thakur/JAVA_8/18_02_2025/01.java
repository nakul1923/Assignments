/*
 * This program gives error bcoz if we use @FunctionalInterface than we have to follow the rules of it.
 * here we have two methods in our interface
 */

@FunctionalInterface  
interface RBI{

    void hello();
    void bye();
}