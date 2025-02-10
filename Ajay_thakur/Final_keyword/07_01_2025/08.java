/*
 * Can we overload abstract method? yes
 */

abstract class A{

    abstract void display();

    abstract void display(int x);
}

class B extends A{


}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

    }
}