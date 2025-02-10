/*
 * program to implement Dynamic binding/late binding/runtime binding
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

class C extends B{

    void display(){

        System.out.println("this is C display");
    }
}

class Beta{

    public static void main(String[] args) {
        
        A obj1 = new C();              // Here reference is A and object is of class C

        obj1.display();
    }
}