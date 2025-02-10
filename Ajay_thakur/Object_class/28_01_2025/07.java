/*
 * 
 * gives error
 */

 class Person{

    int id;
    String name;

    Person(int id, String name){

        this.id = id;
        this.name = name;

    }

    public String toString(){                  
        return id+":"+name;                           
    }
}

class Student extends Person{                      //gives error because there is no default constructor in parent class of student


}

class Main{

    public static void main(String[] args) {
        
        Student p1 = new Student();
        System.out.println(p1);
        
    }
}