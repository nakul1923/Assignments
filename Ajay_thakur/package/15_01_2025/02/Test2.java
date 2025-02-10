package p1;

public class Test2 {

    public Test2(){

        System.out.println("this is test2");
    }

    public void display2(){

        Test1 obj1 = new Test1();

        // System.out.println(obj1.a);            Error bcoz a is private and we cannot access it in another class
        System.out.println(obj1.b);          
        System.out.println(obj1.c);           
        System.out.println(obj1.d);
    }
}