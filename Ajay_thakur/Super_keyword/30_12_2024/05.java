/*
 * Static initilization block
 */

class Person{

    int id;
    String name;



    {
        System.out.println("instance block1");
    }

    static{
        System.out.println("static initilization block");
    }

    Person(){
        System.out.println("default constructor");
    }

    Person(int id){

        this.id = id;
        System.out.println("singl para");
        
        
    }

    Person(int id, StringSystem.out.println(); name){

        this.id = id;
        this.name = name;
        System.out.println("Double para");
    }
}

class Beta{

    public static void main(String[] args) {
        
        Person obj1 = new Person();
        Person obj2 = new Person();
         Person obj3 = new Person(101);
         Person obj4 = new Person(102,"nakul");

    }
}