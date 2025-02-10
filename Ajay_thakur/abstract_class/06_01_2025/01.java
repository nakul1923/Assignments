/*
 * we need to declare abstract in front of 
 */

abstract class A{

    void hello(){

        System.out.println("Hello Guys");
    }

    abstract void display();
}

class B extends A{

    
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        A obj= new B();
    }
}