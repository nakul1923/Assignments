/*
 * program to implement method overriding
 */

class A{

    void display(){

        System.out.println("this is base display");
    }
}

class B extends A{

    void display(){

        System.out.println("this is child display");
    }
}

class Beta{

    public static void main(String[] args) {
        
        B obj1 = new B();

        obj1.display();
    }
}