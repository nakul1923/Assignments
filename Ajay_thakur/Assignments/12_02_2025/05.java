/*
 * WAP for Student class with rollno,name and marks. creater constructor,setter and getter and create objects dynamically and add in treeset based on ascending order of marks.

 * 
 */


import java.util.*;

class Student implements Comparable<Student>{


    public int compareTo(Student o) {
        
        return (int)this.getMarks()-(int)o.getMarks();
    }

    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
    }

    

        
}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        TreeSet<Student> t = new TreeSet<>();

        System.out.println("Enter the number of Students you want to add");

        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the details of Student");
        for(int i=0; i<num; i++){

            System.out.println("Enter name of " + (i+1) + " Student ");
            String name = sc.nextLine();

            System.out.println("Enter Roll Number of " + (i+1) + " Student ");
            int rollNO = sc.nextInt();

            System.out.println("Enter Marks of " + (i+1) + " Student ");
            double marks = sc.nextDouble();
            
            sc.nextLine();

            t.add(new Student(rollNO, name, marks));
            
        }

        System.out.println(t);
        
    }
}