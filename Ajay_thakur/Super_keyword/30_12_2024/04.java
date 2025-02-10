/*
 * Instance initialization block
 */

class Person{

    int id;
    String name;
    static int count;

    {

        System.out.println("Instance block");
        count++;
    }

    Person(){

        System.out.println("Default constructor");
    }

    Person(int id){

        this.id = id;
        System.out.println("Single para");
        
    }

    Person(int id, String name){

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

          System.out.println(obj2.count());
    }

    
}