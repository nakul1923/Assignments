/*
 *  excercise given by sir
 */

 import java.util.Objects;

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

    public boolean equals(Person p){

        return this.id == p.id && this.name == p.name;
    }

    public int hashCode(){

        return Objects.hash(id,name);
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

    public boolean equals(Student s){

        return super.equals(s) && this.tension == s.tension;
    }

    public int hashCode(){

        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(tension);
        return result;
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

    public boolean equals(MastiKhor m){

        return super.equals(m) && this.party == m.party;
    }

    public int hashCode(){

        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(party);
        return result;
    }
}

class Main{

    public static void main(String[] args) {
        
        MastiKhor p1 = new MastiKhor(101,"rashmika ","Assignment","yes");
        MastiKhor p2 = new MastiKhor(101,"rashmika ","Assignment","yes");
        
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
    }
}