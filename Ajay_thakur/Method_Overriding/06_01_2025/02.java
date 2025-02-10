/*
 *  
 */

class A{

    protected void display(){

        System.out.println("this is base display");
    }
}

class B extends A{

    public void display(){

        System.out.println("this is child display");
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        A obj = new B();
        obj.display();
    }
}