/*
 * error bcoz we cannot create object of interface
 */

interface Rashmika{

    int x=10;

    void hello();
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        Rashmika obj  = new Rashmika();
    }
}