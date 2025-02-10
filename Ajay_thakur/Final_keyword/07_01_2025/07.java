/*
 * gives error because we cannot override final method
 */

class A{

    public final void display(){

        System.out.println("hello guys");
    }
}

class B extends A{

    public void display(){

    }
}

class Beta{

    public static void main(String[] args) {
        
        
    }
}