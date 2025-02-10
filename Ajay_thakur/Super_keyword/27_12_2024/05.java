/*
 * 
 * super keyword at constructor level
 */

class A {

}

class B extends A{

    B(){

        super();

        System.out.println("this is B class default");
    }
}

class Beta{

    public static void main(String[] args) {
        
        B obj1 = new B();
    }
}
