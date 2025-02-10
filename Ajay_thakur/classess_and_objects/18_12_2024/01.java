/*
 * Program to implement class and objects
 */

class Person {

    int id;
    String name ; 
}

class Beta {
    
    public static void main(String[] args) {
        
        Person p1 = new Person();

        p1.id= 101 ;
        p1.name = "rashmika";

        System.out.println(p1.id + " and " + p1.name);
    }
}
