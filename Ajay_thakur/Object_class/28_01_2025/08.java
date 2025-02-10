/*
 *  check output
 * 
 * in this program parent class toString method executes
 * 
 */

 class Person{

    int id;
    String name;

    Person(int id, String name){

        this.id = id;
        this.name = name;

    }

    Person(){


    }

    public String toString(){                  
        return id+":"+name;                           
    }
}

class Student extends Person{                   

}

class Main{

    public static void main(String[] args) {
        
        Student p1 = new Student();
        System.out.println(p1);
        
    }
}