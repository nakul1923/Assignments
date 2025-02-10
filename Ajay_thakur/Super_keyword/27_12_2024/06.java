/*
 * This program gives error because there is a constructor in parent class so it cannot make a default constructor
 */

class A{

    A(int x){

        System.out.println(" this is A class single para");
    }
}

class B extends A{

    B(){

        System.out.println("this is B class default");
    }
}

class Beta{

    public static void main(String[] args) {
        
        B obj1 = new B();
    }
}