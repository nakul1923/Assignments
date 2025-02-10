/*
 * Static final attribute
 */

class A{
     static final int x;

     A(){


     }

     A(int y){


     }

     static{

        x = 900;
     }
}

class Beta{

    public static void main(String[] args) {
        A obj = new A();
        A obj2 = new A(190);

        System.out.println(obj.x);
        System.out.println(obj2.x);
    }
}