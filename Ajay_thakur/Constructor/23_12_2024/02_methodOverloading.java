/*
 * program to implement Method Overloading
 */


class Add{

    void sum(int x,int y){

        System.out.println(x+y);
    }

    void sum(int a, int b, int c){

        System.out.println(a+b+c);
    }

    void sum(double x,double y){
        System.out.println(x+y);
    }

    void sum(int x, double y){

        System.out.println(x+y);
    }
    
    void sum(double x, int y){
        System.out.println(x+y);
    }
}

class Beta{

    public static void main(String[] args) {
        
        Add obj1 = new Add();

        obj1.sum(10,20);
        obj1.sum(10, 20,30);
        obj1.sum(10.65,23.76);
        obj1.sum(10,23.76);
    }
}

