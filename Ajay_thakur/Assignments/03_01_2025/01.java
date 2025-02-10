class Shape{

    void calculateArea(){

        System.out.println("Area calculation not defined for Shape");
    }
}

class Circle extends Shape{

    double radius;

    Circle(double radius){

        this.radius = radius;
    }

    void calculateArea(){
    
        System.out.println("Area of Circle is " + (3.14*radius*radius));

    }
}

class Rectangle extends Shape{

    int length;
    int breadth;

     Rectangle(int length, int breadth){

        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea(){

        System.out.println("Area of rectangle is " + (length*breadth));
    }
}

class Beta{

    public static void main(String[] args) {
        
        Shape ob1 = new Circle(5);
        ob1.calculateArea(); 

        Shape ob2 = new Rectangle(10, 20);
        ob2.calculateArea();
    }
}