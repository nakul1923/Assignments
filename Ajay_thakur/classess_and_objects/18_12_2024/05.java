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

    void show(){

        System.out.println("sum is " + c);
    }
}

class Beta {
    
    public static void main(String[] args) {
        
        Sum obj1 = new Sum();

        obj1.giver(100,200);
        obj1.add();
        obj1.show();

        Sum obj2 = new Sum();

        obj2.giver(500,700);
        obj2.add();
        obj2.show();

        
    }
}
