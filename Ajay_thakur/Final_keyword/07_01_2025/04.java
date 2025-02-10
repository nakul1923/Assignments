/*
 * we can initialize value of final attribute in constructor
 */

class A{

    final int x;

    A(){
        x = 10;
    }

    A(int y){


    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        A obj= new A();
    }
}