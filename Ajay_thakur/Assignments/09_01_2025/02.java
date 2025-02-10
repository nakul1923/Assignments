interface Shape{

    void calculateArea();
}

class Circle implements Shape{

    double radius;

    Circle(double radius){

        this.radius = radius;
    }

    public void calculateArea(){

        double area = 3.14 * radius * radius;

        System.out.println("Area of Circle is " + area);
    }
}

class Rectangle implements Shape{

    int length;
    int breadth;

    Rectangle(int length, int breadth){

        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        
        int area = length * breadth;

        System.out.println("Area of rectangle is " + area);
    }
}

class Main{

    public static void main(String[] args) {
        
        Shape s1 = new Circle(5);

        s1.calculateArea();

        Shape s2 = new Rectangle(10,20);

        s2.calculateArea();
    }
}
