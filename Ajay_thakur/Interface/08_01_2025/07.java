interface Deepika{

    void m1();
}

interface Rashmika{

    void hello();
}

abstract class Pushpa{

abstract void kuchbhi();
}

class A extends Pushpa implements Rashmika,Deepika{

    public void hello(){

        System.out.println("hello guys");
    }

    public void kuchbhi(){

        System.out.println("kuch bhi guys");
    }

    public void m1(){

        System.out.println("m1 methods");
    }
}


class Beta{

    public static void main(String[] args) {
        
        A obj = new A();
        obj.hello();
        obj.m1();
        obj.kuchbhi();
        Deepika obj1 = new A();

        obj1.m1();

    }
}