class Person{

    int id;
    String name;
    int count;
    

    Person(){

        count++;
    }

}

class Beta{

    public static void main(String[] args) {
        
        Person obj1 = new Person();
        Person obj2 = new Person();
    }
}