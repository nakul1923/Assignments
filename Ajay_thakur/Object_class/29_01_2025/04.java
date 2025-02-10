/*
 * in this program we are overriding equals method 
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


}

class Main{

    public static void main(String[] args) {
        
        Person p1 = new Person(101, "rashmika");
        Person p2 = new Person(101, "rashmika");

        System.out.println(p1.equals(p2));                        
    }
}