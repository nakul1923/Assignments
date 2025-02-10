
/*
 * Program to implement class and objects and methods
 */

class Person {

    int id;
    String name ; 

    void set(){

        id = 101;
        name = "abc";
    }

    void display(){

        System.out.println(id + " and " + name);
    }
}

class Beta {
    
    public static void main(String[] args) {
        
        Person p1 = new Person();

        p1.set();
        p1.display();
    }
}
