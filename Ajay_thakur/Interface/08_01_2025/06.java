interface Deepika{

    void m1();
}

interface Rashmika extends Deepika{
    
    void hello();
    void welcome();
}

class A implements Rashmika{

    public void hello(){

        System.out.println("hello guys");
    }

    public void welcome(){

        System.out.println("Welcome guys");
    }

    public void m1{

        System.out.println("this is m1");
    }
}



class Beta{

    public static void main(String[] args) {
        
        Rashmika obj = new B();
        obj.hello();
        obj.welcome();
        obj.m1();


    }
}