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
        Student p2 = new Student(101,"rashmika ","Assignment");
       
        int i = 10;
        int j = 10;
        System.out.println(p1==p2);                                 //here the address are comparing bcoz they are object
        System.out.println(i==j);                               //here values are comparing bcoz they are attributes
        
    }
}