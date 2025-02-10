class A{

    int a;
    int b;

    void display1(){

        System.out.println("Class A executed");
    }
}

class B extends A{

    int c;
    


    void add(){

        a = 10;
        b = 20;
        c = a + b;
    }

    void display2(){

        System.out.println("class B executed");
        System.out.println(c);
    }

}

class C extends B{
    int d;

    void product(){

        a = 30;
        b = 40;
        d = a*b;
    }

    void display3(){

        System.out.println("class C executed");
        System.out.println(d);
    }
}

class Demo{

    public static void main(String[] args) {
        
        C obj1 =  new C();

        obj1.display1();

        obj1.add();
        obj1.display2();

        obj1.product();
        obj1.display3();

    }
}