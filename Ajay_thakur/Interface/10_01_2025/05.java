interface Alpha{

    static void hello(){

        System.out.println("hello guys");
    }

    default void welcome(){

        System.out.println("welcome");
    }

    void add();
}

class Child implements Alpha{

    public void add(){

        System.out.println("this is add");
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        Alpha obj = new Child();
        obj.welcome();
        obj.add();
        Alpha.hello();

    }
}