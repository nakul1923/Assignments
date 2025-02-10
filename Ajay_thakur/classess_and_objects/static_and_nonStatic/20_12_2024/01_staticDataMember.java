/*
 * program to implement static data member
 */

class Gama {

    int a;
    static int b ;

    void set(int x, int y){

        a = x ;
        b = y ;

    }

    void display(){

        System.out.println("nonstatic a is " + a);
        System.out.println("Static b is " + b);
        


}
}

class Beta{
    public static void main(String[] args) {
        
        Gama obj1 = new Gama();
        obj1.set(101, 999);
        obj1.display();

        Gama obj2 = new Gama();
        obj2.set(102, 888);
        obj2.display();

        obj1.display();
    }
}