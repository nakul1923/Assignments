interface Rashmika{

    int x = 90;
    
    void hello();
    void welcome();
}

abstract class A implements Rashmika{

    public void hello(){

        System.out.println("hello guys");
    }
}

class B extends A{

    public void welcome(){

        System.out.println("Welcome guys");
    }
}

class Beta{

    public static void main(String[] args) {
        
        Rashmika obj = new B();
        obj.hello();
        obj.welcome();

        System.out.println(obj.x);

        System.out.println(Rashmika.x);
    }
}