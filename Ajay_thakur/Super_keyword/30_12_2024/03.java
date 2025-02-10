class Person{

    int id;
    String name;
    static int count;

    Person(){

        count++;
    }

    Person(int id){

        this.id = id;
        count++;
    }

    Person(int id, String name){

        this.id = id;
        this.name = name;
        count++;
    }

}

class Beta{

    Person obj1 = new Person();
    Person obj2 = new Person();
    Person obj3 = new Person(101);
    Person obj4 = new Person(102,"nakul");

    System.out.println(obj2.count);
}