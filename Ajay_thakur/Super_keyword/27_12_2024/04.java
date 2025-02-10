/*
 * Super keyword at constructor level
 */

class A{

    A(){

        System.out.println("this is A class default");
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