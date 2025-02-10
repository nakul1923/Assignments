/*
 * super keyword at constructor level
 */

class A{

    A(int x){

        System.out.println(" this is A class single para");
    }
}

class B extends A{

    B(){

        super(10);
        System.out.println("this is B class default");
    }
}

class Beta{

    public static void main(String[] args) {
        
        B obj1 = new B();
    }
}