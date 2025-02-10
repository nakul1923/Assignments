/*
 * Super and This in constructor chaining
 */

class A{

    A(){

        System.out.println("this is A class default");
    }

    A(int x){

        System.out.println("this is A class single para");
    }

    A(int x,int y){

        System.out.println("this is A class double para");
    }
}

class B extends A{

    B(){

        super(10);

        System.out.println("this is B class default");
    }

    B(int x,int y){

        this();

        System.out.println("this is B class two para");
    }
}

class Beta{

    public static void main(String[] args) {
        
        B obj1 = new B(10,20);
    }
}