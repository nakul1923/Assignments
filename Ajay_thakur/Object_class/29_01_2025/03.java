/*
 * in the above example equals method of object class will be called

the object class equals method have default behaviour which compares address
 */

class Person{

    private int id;
    private String name;

    Person(int id,String name){

        this.id = id;
        this.name = name;
    }


}

class Main{

    public static void main(String[] args) {
        
        Person p1 = new Person(101, "rashmika");
        Person p2 = new Person(101, "rashmika");

        System.out.println(p1.equals(p2));                          //return false      
    }
}