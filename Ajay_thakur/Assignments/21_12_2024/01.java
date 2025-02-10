class Student {
    
    int id;
    String name;

   

    void set(){

        this.id = 101 ;
        this.name = "nakul";
    }

    void get(){

        System.out.println(id + ":" + name);
    }
}

class Beta{

    public static void main(String[] args) {
        
       Student s1 = new Student();
       Student s2 = new Student();

        s1.set();
        s1.get();

        s2.set();
        s2.get();


       
        
    }
}
