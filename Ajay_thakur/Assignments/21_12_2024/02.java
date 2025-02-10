class Student {
    
    int id;
    String name;

    Student(){

        id = 101 ;
        name = "nakul";
    } 

    void get(){

        System.out.println(id + ":" + name);
    }
}

class Beta{

    public static void main(String[] args) {
        
       Student s1 = new Student();

       s1.get();
       Student s2 = new Student();

       
       s2.get();


       
        
    }
}
