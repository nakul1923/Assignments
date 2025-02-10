/*
 * 
 * gives error because we cannot change the datatype of overriding method
 * 
 * in object class the return type of 
 * 
 */

 class Person{

    int id;
    String name;

    Person(int id, String name){

        this.id = id;
        this.name = name;

    }

    public int toString(){                  //here we break the overriding rule

        return id;                           
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