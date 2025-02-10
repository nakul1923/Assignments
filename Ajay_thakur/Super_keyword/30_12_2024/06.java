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

    Person(int id, String name){

        this.id = id;
        this.name = name;
        System.out.println("Double para");
    }
}

class Beta{

    public static void main(String[] args) {

        System.out.println("main start");


        
        Person obj1 = new Person();
        Beta obj2 = new Beta();

    
        

    }

    static {

        System.out.println("Main Static");
    }
    
    {
        System.out.println("instance beta");
    }
}