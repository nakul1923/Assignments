/*
 * You are working on a student management system where you need to filter student records based on different conditions using Stream API and the filter() method.

Implement a Java program that does the following:

Create a Student class with the following attributes:

int id
String name
int age
double marks
String department
Create a list of students (at least 8 students with different attributes).

Use Stream API and filter() to perform the following operations:

Display students who have marks greater than 75.
Display students who belong to the "Computer Science" department.
Display students who are older than 20 years.
Display students whose names start with 'A'.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


        List<Student> greaterMarks = l.stream().filter(x->x.getMarks()>75).collect(Collectors.toList());

        System.out.println("students who have marks greater than 75 are \n");

        for(Student s:greaterMarks){

            System.out.println("Name = " + s.getName() + " Marks = " + s.getMarks());
        }

        System.out.println("students who belong to the \"Computer Science\" department are \n");

        List<Student> computerScience = l.stream().filter(x->x.getDepartment().equals("Btech")).collect(Collectors.toList());

        for(Student s:computerScience){

            System.out.println("Name = " + s.getName() + " Department = " + s.getDepartment());
        }

        System.out.println("students who are older than 20 years are \n");

        List<Student> older = l.stream().filter(x->x.getAge()>20).collect(Collectors.toList());

        for(Student s:older){

            System.out.println("Name = " + s.getName() + " Age = " + s.getAge());
        }

        System.out.println("students whose names start with 'A' are \n");

        List<Student> nameWithA = l.stream().filter(x->x.getName().startsWith("a")||x.getName().startsWith("A")).collect(Collectors.toList());

        for(Student s:nameWithA){

            System.out.println("Name = " + s.getName());
        }

    }
}