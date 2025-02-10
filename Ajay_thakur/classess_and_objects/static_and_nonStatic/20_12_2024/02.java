class Gama{

    int a;
    static int b;

    void m1(){

        System.out.println("m1 non static");
    }

    void m2(){

        m1();
        m3();

        System.out.println("m2 non static");
    }

    static void m3(){

        m4();

        Gama obj7 = new Gama();
        obj7.m1();

        System.out.println("m3 static method");
    }

    static void m4(){

        System.out.println("m4 static metod");
    }
}


class Beta {
    
    public static void main(String[] args) {

        //m1(); Error

        //Gam.m1(); error
        
        Gama obj1 = new Gama();

        obj1.m1();

        obj1.m2();

        // m3();

        Gama.m4();

    }
}
