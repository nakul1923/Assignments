/*
 *  gives error
 */

 class Person{

    private int id;
    private String name;

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

    String tension;

    Student(int id,String name,String tension){

        super(id,name);
        this.tension = tension;
    }

    public String toString(){

        return id+":"+name+":"+tension;                       //gives error because we make id and name private in parent class                   
    }
}

class Main{

    public static void main(String[] args) {
        
        Student p1 = new Student(101,"rashmika ","Assignment");
        System.out.println(p1);
        
    }
}