class Alpha{

    public static void hello(){

        System.out.println("hello guys");
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        Alpha.hello();
    }
}