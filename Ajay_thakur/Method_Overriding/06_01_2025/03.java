/*
 *  here in both methods static is written but parent class method is run bcoz we cannot override static methods in subclass
 */

class A{

    static void display(){

        System.out.println("this is base display");
    }
}

class B extends A{

    static void display(){

        System.out.println("this is child display");
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        A obj = new B();
        obj.display();
    }
}