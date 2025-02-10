class Student {
    
    int id;
    String name;

    Student(int id, String name){

        this.id = id;
        this.name = name;

        System.out.println("para constructor");
    }

    void display(){

        System.out.println(id + ":" + name);
    }
}

class Beta{

    public static void main(String[] args) {
        
        Student s1 = new Student(101,"abc");
        s1.display();

        Student s2 = new Student(102,"rashmika");
        s2.display();
    }
}
