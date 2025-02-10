/*
 * output is 400 in this program class B a is used
 */

class A{

    int a;
}

class B extends A{

    int a,c;
    void set(int x, int y){

        a= x;
        a = y;

    }

    void add(){

     c = a+a;
    }

    void display(){

        System.out.println(c);
    }
}

class Beta{

    public static void main(String[] args) {
        
        B obj1 = new B();

        obj1.set(100,200);
        obj1.add();
        obj1.display();
    }
}