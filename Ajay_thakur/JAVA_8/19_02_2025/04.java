interface Add{

    public void sum(int a, int b);
}

class Main{

    public static void main(String[] args) {
        
        Add obj = (a, b)->{

            System.out.println("welcome");
            System.out.println(a+b);
            System.out.println("done");
        };
        obj.sum(10, 20);
    }
}