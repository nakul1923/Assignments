/*
 * working of single inheritence 
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

class Beta{
    public static void main(String[] args) {
        
        B obj1 = new B();
        obj1.display1();

        obj1.add();
        obj1.display2();
    }
}