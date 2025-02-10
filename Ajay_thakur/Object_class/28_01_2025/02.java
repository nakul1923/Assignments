/*
 * check output
 * 
 * When we try to append an object to a string or if we try to print an object than two string methods will be called

If toString method is not present in our class than object class toString will be called
 */

 class Person{

    int id;
    String name;

    Person(int id, String name){

        this.id = id;
        this.name = name;

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