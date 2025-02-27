
import java.util.ArrayList;
import java.util.Optional;

 
 class Student{
 
     private int id;
     private String name;
     private int age;
     private double marks;
     private String department;
 
     public Student(int id, String name, int age, double marks, String department) {
         this.id = id;
         this.name = name;
         this.age = age;
         this.marks = marks;
         this.department = department;
 
     }
 
     public int getId() {
         return id;
     }
 
     public void setId(int id) {
         this.id = id;
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public int getAge() {
         return age;
     }
 
     public void setAge(int age) {
         this.age = age;
     }
 
     public double getMarks() {
         return marks;
     }
 
     public void setMarks(double marks) {
         this.marks = marks;
     }
 
     public String getDepartment() {
         return department;
     }
 
     public void setDepartment(String department) {
         this.department = department;
     }
 
     @Override
     public String toString() {
         return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", department="
                 + department + "]";
     }
     
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         ArrayList<Student> l = new ArrayList<>();
 
         l.add(new Student(101, "nakul", 22, 90, "BCA"));
         l.add(new Student(102, "Shrey", 21, 80, "Btech"));
         l.add(new Student(103, "rohit", 22, 75, "Bcom"));
         l.add(new Student(104, "sandeep", 24, 68, "Bocm"));
         l.add(new Student(105, "Aashish", 23, 45, "MCA"));
         l.add(new Student(106, "Yashika", 20, 64, "Btech"));
         l.add(new Student(107, "Abhishek", 25, 95, "MBA"));
         l.add(new Student(108, "Yachika", 19, 55, "BCA"));
 
 
 
         Optional<Student> Omin = l.stream().min((x,y)->{
            if(x.getAge()>y.getAge()){

                return 1;
            } else{
                return -1;
            }
         });

         Optional<Student> Omax = l.stream().max((x,y)->{
            if(x.getAge()>y.getAge()){

                return 1;
            } else{
                return -1;
            }
         });

         if(Omin.isPresent()){

            System.out.println("Youngest Student is \nName = " + Omin.get().getName() + "\nAge = " + Omin.get().getAge());
         }

         if(Omax.isPresent()){

            System.out.println("Oldest Student is \nName = " + Omax.get().getName() + "\nAge = " + Omax.get().getAge());
         }

                 
 
     }
 }