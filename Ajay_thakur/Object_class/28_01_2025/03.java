/*
 * check output
 * 
 * Each and every method in object class have default behaviour. if we want to change that behaviour than we need to override object class method in our class.
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

class Main{

    public static void main(String[] args) {
        
        Person p1 = new Person(101, "Rashmika");
        System.out.println(p1);
        String s1 = p1+"katappa";
        System.out.println(s1);
    }
}