interface Add{

    public void sum(int a, int b);
}

class A implements Add{

    public void sum(int a, int b){

        System.out.println("Welcome");
        System.out.println(a+b);
        System.out.println("Done");
    }
}

class Main{

    public static void main(String[] args) {
        
        Add obj = new A();
        obj.sum(10, 20);
    }
}