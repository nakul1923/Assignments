/*
 * Student Management using HashSet
Write a Java program that enables users to dynamically input student details and store them in a HashSet, ensuring that no duplicate students exist (based on studentId).

Class Specifications:
Create a class named Student with the following private attributes:

studentName - String
studentId - int
studentCourse - String
The Student class should include:

Getter methods for all attributes.
Overridden toString() method to return student details.
Overridden hashCode() and equals() to ensure uniqueness based on studentId.
Functionalities:
The program should allow the user to add students dynamically.
It should prevent duplicate student entries based on studentId.
It should display all students stored in the HashSet.
Input Format:
The first line consists of the number of students.
The next consecutive lines contain studentName, studentId, and studentCourse.
Output Format:
Display the list of students (duplicates should be ignored).

 */


import java.util.*;

class Student{

    String name;
    int id;
    String course;
    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getCourse() {
        return course;
    }
    
    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", course=" + course + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}



class Main{

    public static void main(String[] args) {
        
        HashSet<Student> h = new HashSet<>();

        Student s1 = new Student("nakul", 101, "BCA");
        Student s2 = new Student("rohit", 102, "BBA");
        Student s3 = new Student("Aashis", 101, "Bcom");

        h.add(s1);
        h.add(s2);
        h.add(s3);

        System.out.println(h);
    }
}