/*
 * this program gives error
 */

class Person{


}

class Student extends Person{


}

class A{

    Student display(){

        System.out.println("this is base display");

        return null;
    }
}

class B extends A{

    Person display(){

        System.out.println("this is child display");

        return null;
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main Start");

        A obj = new B();
        obj.display();
    }
}