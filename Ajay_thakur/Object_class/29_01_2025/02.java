

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
        Student p3 = p1; 
        System.out.println(p1==p3);                                 //true
        System.out.println(i==j);                               //here values are comparing bcoz they are attributes
        
    }
}