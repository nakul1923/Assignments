import java.util.ArrayList;

class Student{

    private int id;
    private String name;
    private double marks;

    public int getId(){

        return id;
    }

    public void setId(int id){

        this.id = id;
    }

    public String getname(){

        return name;
    }

    public void setId(String name){

        this.name = name;
    }

    public double getMarks(){

        return marks;
    }

    public void setMarks(double marks){

        this.marks = marks;
    }

    Student(int id,String name,double marks){

        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}


class Main{
    

    public static void main(String[] args) {
        
        List<Student> l =new ArrayList<Student>();

        Student s1 = new Student(101,"rashmika",98);

        Student s2 = new Student(102,"pushpa",65);

        l.add(s1);
        l.add(s2);

        System.out.println(l);

        for(Student s:l){

            System.out.println((s.getId()) + " :" + s.getname()+ " :" + s.getMarks());
        }
    }
}