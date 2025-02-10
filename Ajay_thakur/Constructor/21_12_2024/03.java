class Student {
    
    int id;
    String name;

    Student(int id, String name){

        this.id = id;
        this.name = name;

        System.out.println("para constructor");
    }

    Student(){


    }

    void display(){

        System.out.println(id + ":" + name);
    }
}

class Beta{

    private Beta(){

        System.out.println("Beta private constructor");
    }

    public static void main(String[] args) {
        
        Student s1 = new Student(101,"abc");
        s1.display();

        Student s2 = new Student(102,"rashmika");
        s2.display();

        Beta obj2 = new Beta();
    }
}
