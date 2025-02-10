/*
 * working of multilevel inheritence 
 */

class A{
    int a;
    void display1(){

        System.out.println("this is display1 of base class");
    }

    
    }
class B extends A{
        int b,c;

        void add(){
            a=100;
            b=200;
            c=a+b;
        }

        void display2(){
            System.out.println(c);
        }

}

class C extends B{

    int x;

    void multiply(){

        x = a*b*c;
    }

    void display3(){

        System.out.println(x);
    }
}

class Beta{
    public static void main(String[] args) {
        
        C obj1 = new C();
        obj1.display1();

        obj1.add();
        obj1.display2();

        obj1.multiply();
        obj1.display3();
    }
}
