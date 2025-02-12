/*
 * ArrayList of Objects
Objective: Use an ArrayList to manage custom objects.
Tasks:

Create a Student class with attributes like name, age, and marks.
Add multiple Student objects to an ArrayList.
Display the details of all students.

 */

import java.util.*;

class Student{

    String name;
    int age;
    double marks;

    Student(String name, int age, double marks){

        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString(){

        return "Name : " + name + " Age : " + age + " Marks : " + marks;
    }
}

class Main{

    public static void main(String[] args) {
        
        Student s1 = new Student("Nakul", 22, 99);
        Student s2 = new Student("Rohit", 23, 80);
        Student s3 = new Student("Shrey", 22, 88);

        ArrayList<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);
    }
}