interface I1 {

     public void m1();
}

class A implements I1{

    public void m1(){

        System.out.println("hello guys");
    }
}

class Main{

    public static void main(String[] args) {
        
        I1 obj = new A();
        obj.m1();
    }
}