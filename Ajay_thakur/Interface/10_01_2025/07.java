/*
 * program to implement private methods in interface
 */

interface I1{

    private void calculation(){

        System.out.println("IMP code");
    }

    default void welcome(){

        calculation();
        System.out.println("default");
    }

    static void hello(){

        System.out.println("hello");
    }
}

class A implements I1{


}

class Demo1 {

    public static void main(String[] args) {
        package ;


        System.out.println("hiii");

        I1.hello();
        I1 obj = new A();
        obj.welcome();

    }
}