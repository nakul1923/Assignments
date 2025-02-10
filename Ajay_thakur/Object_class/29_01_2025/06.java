/*
 * in this program we are overriding hashCode method and printing id as a hashcode
 */

 class Person{

    private int id;
    private String name;

    Person(int id,String name){

        this.id = id;
        this.name = name;
    }

    public boolean equals(Person p){

        return this.id == p.id && this.name.equals(p.name);
    }

    public int hashCode(){

        return id;
    }


}

class Main{

    public static void main(String[] args) {
        
        Person p1 = new Person(101, "rashmika");
        Person p2 = new Person(102, "rashmika");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());                 
    }
}