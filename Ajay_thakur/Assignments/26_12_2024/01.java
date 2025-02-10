class A{

    int a;
    int b;

    void display1(){

        System.out.println("Class A execute");
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

        System.out.println(c);
    }

}

class Demo{

    public static void main(String[] args) {
        
        B obj1 =  new B();

        obj1.display1();

        obj1.add();
        obj1.display2();
    }
}