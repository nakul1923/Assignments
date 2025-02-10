/*
 * program to implement default constructor
 */

class Student{

    int id;
    String name;

    Student(){

        id = 101 ;
        name = "abc";

        System.out.println("Default constructor");

    }
    void display(){

        System.out.println(id + ":" + name);
    }

    
}

class Beta{

    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student();
        s2.display();
    }
}