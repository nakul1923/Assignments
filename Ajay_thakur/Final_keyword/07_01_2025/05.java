class A{

    final int x;

    A(){
        
    }

    A(int y){

    
    }

    {
        x = 100;                  // instance initiliazation block
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        A obj1 = new A();
        A obj2 = new A(190);
    }
}