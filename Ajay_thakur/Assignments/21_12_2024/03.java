class Student {
    
    int id;
    String name;

    Student(int id, String name){

        this.id = id;
        this.name = name;
    }

    void get(){

        System.out.println(id + ":" + name);
    }
}

class Beta{

    public static void main(String[] args) {
        
       Student s1 = new Student(101, "nakul");

       s1.get();
       Student s2 = new Student(102 , "rashmika");

       
       s2.get();


       
        
    }
}
