/*
 * this program gives error bcoz here overriding is happening but return type are not same (primitive return type)
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

    int display(){

        System.out.println("this is C display");

        return 0;
    }
}

class Beta{

    public static void main(String[] args) {
        
        A obj1 = new C();              // Here reference is A and object is of class C

        obj1.display();
    }
}