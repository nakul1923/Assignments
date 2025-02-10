/*
 * Program to implement this keyword
 */

class Person {

    int id;
    String name;

    void giver(int id, String name){

        this.id = id ;
        this.name = name;
    }

    void show(){

        System.out.println(id + " and " + name);
    }
}

class Beta {
    
    public static void main(String[] args) {

        
       Person p1 = new Person();

       p1.giver(101,"abc");

       p1.show();

     
    }
}

