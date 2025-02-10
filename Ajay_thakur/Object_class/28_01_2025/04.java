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

        return id;                           // cannot return int type
    }
}

class Main{

    public static void main(String[] args) {
        
        Person p1 = new Person(101, "Rashmika");
        System.out.println(p1);
        String s1 = p1+"katappa";
        System.out.println(s1);
    }
}