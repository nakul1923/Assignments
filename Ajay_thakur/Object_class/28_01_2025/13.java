/*
 *  excercise given by sir
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

        return super.toString()+":"+tension;                                         
    }
}

class MastiKhor extends Student{

    String party;
    MastiKhor(int id,String name,String tension,String party){

        super(id,name,tension);
        this.party = party;
    }

    public String toString(){

        return super.toString()+":"+party;
    }
}

class Main{

    public static void main(String[] args) {
        
        MastiKhor p1 = new MastiKhor(101,"rashmika ","Assignment","yes");
        System.out.println(p1);
        
    }
}