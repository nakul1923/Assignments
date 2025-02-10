class multiply {

    int a,b,c,d,total;

    void input(int a,int b, int c,int d){

        this.a = a ;
        this.b = b ;
        this.c = c ;
        this.d = d ;

    }

    void mul(){

        total = a*b*c*d;

    }

    int show(){

        return total;
    }
}

class Demo {
    
    public static void main(String[] args) {
        
        multiply obj1 = new multiply();

        obj1.input(1, 2, 3, 4);

        obj1.mul();

        int product = obj1.show();

        System.out.println("multiplication is " + product);

    }
}
