/*
 * giver error because final attribute value cannot change
 */

class A{

    final int x=10;
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        A obj= new A();

        obj.x = 15;
    }
}