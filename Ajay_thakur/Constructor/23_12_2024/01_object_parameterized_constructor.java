/*
 * program to implement object parameterized constructor
 */

class Student{

    int id;
    String name;
    Student(int id, String name){

        this.id = id;
        this.name = name;

        System.out.println("para constructor");
    }

    void display(){

        System.out.println(id + ":" + name);
    }

    Student(Student x){

        this.id = x.id;
        this.name = x.name;
    }

    Student(){

    }
}

class Beta {

    public static void main(String[] args) {
        
        Student s1 = new Student(102, "abc");
        s1.display();

        Student s2 = new Student(s1);

        s2.display();
    }
}