/*
 * Run program to check the flow of code
 */

class Person{

    {
        System.out.println("Instance block");
    }

    static{
        System.out.println("static initilization block");
    }

    Person(){
        System.out.println("default constructor");
    }
}

class Employee extends Person{

    {
        System.out.println("instance block1 employee");
    }

    static{
        System.out.println("static initilization block employee");
    }

    Employee(){
        System.out.println("default constructor of employee");
    }
}

class Beta{

    public static void main(String[] args) {
        
        System.out.println("main start");

        Employee obj1 = new Employee();
    }
}

