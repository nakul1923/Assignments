class Person{

    {
        System.out.println("1");

    }
    
    static {
        System.out.println("2");
    }

    Person(){

        this(10);
        System.out.println("3");
    }

    Person(int x){

        this(10,20);
        System.out.println("4");
    }

    Person(int x, int y){

        System.out.println("5");
    }
}

class Employee extends Person{

    {
        System.out.println("6");
    }

    static{
        System.out.println("7");
    }

    Employee(int x, int y){

        this(10);
        System.out.println("8");
    }

    Employee(int x){

        super(10);
        System.out.println("9");
    }
}

class Beta{

    public static void main(String[] args) {
        System.out.println("main start");
        Employee obj1 = new Employee(10,20);
    }
}