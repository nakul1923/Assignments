/*
 *  in this program we are overriding toString method to child class to print third member
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

    String tension;

    Student(int id,String name,String tension){

        super(id,name);
        this.tension = tension;
    }

    public String toString(){

        return super.toString()+":"+tension;                               // we can also write this way   return id+":"+name+":"+tension
    }
}

class Main{

    public static void main(String[] args) {
        
        Student p1 = new Student(101,"rashmika ","Assignment");
        System.out.println(p1);
        
    }
}