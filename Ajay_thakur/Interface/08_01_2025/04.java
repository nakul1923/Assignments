/*
 * program to implement interface
 */

interface Rashmika{

    int x = 10;
    void hello();
}

class A implements Rashmika{

    public void hello(){

       System.out.println("hello guys");
    }
}

class Beta{

    public static void main(String[] args) {
        
        Rashmika obj = new A();

        obj.hello();
    }
}