/*
 * Program to implement class and objects and methods to add two numbers
 */

class Sum {

    int a,b,c;

    void giver(){

        System.out.println("giver method called");
        a= 10;
        b = 20 ;
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

        obj1.giver();
        obj1.add();
        obj1.show();

        
    }
}