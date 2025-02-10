/*
 * here method overriding is not happening bcoz we broke the rule but run program and see the flow of program
 * 
 *  version 1
 */

class A{

    void display(int x){

        System.out.println("this is base display");
    }
}

class B extends A{

    void display(){

        System.out.println("this is child display");
    }
}

class C extends B{

    int display(){

        System.out.println("this is C display");

        return 0;
    }
}

class Beta{

    public static void main(String[] args) {
        
        A obj1 = new C();              // Here reference is A and object is of class C

        obj1.display(10);
    }
}