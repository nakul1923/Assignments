/*
 * Program to implement method with arguments
 */

class Sum {

    int a,b,c;

    void giver(int x, int y){

        System.out.println("giver method called");
        a= x;
        b = y;
    }

    void add(){

        System.out.println("add method called");
        c= a+b ;
    }

    int show(){

        return c ;
    }
}

class Beta {
    
    public static void main(String[] args) {

        
        Sum obj1 = new Sum();

        obj1.giver(100,200);
        obj1.add();
        int w = obj1.show();

        System.out.println("sum is " + w);

        Sum obj2 = new Sum();

        obj2.giver(500,700);
        obj2.add();
        int q = obj2.show();

        System.out.println("sum is " + q);

        
    }
}

