/*
 *  not gives error because in this we made getter and setter for id and name in parent class
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

    public int getId(){

        return id;
    }

    public String getName(){

        return name;
    }
}

class Student extends Person{                   

    String tension;

    Student(int id,String name,String tension){

        super(id,name);
        this.tension = tension;
    }

    public String toString(){

        return getId()+":"+getName()+":"+tension;                                         
    }
}

class Main{

    public static void main(String[] args) {
        
        Student p1 = new Student(101,"rashmika ","Assignment");
        System.out.println(p1);
        
    }
}