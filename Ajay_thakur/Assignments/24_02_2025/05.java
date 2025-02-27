/*
 * Employee Salary Hike
Problem Statement:
A company wants to give a 10% hike to all employees earning below ₹50,000. Write a program using Function<Employee, Employee> to update the salary of such employees.
Create an Employee class with id, name, and salary.
Use Function<Employee, Employee> to update salaries.
Apply the function on a list of employees and print updated salaries.

 */

import java.util.ArrayList;
import java.util.function.Function;

class Employee{

    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    
}

class Main{

    public static void main(String[] args) {
        
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(101, "nakul", 60000));
        al.add(new Employee(102, "shrey", 40000));
        al.add(new Employee(103, "rohit", 35000));
        al.add(new Employee(104, "mohit", 65000));

        Function<Employee,Employee> f = e->{

            if(e.getSalary()<50000){

                double newSalary = e.getSalary() + (e.getSalary()*10/100);
                e.setSalary(newSalary);

                return e;
            } else{

                return e;
            }

            
        };

        for(Employee e:al){

            System.out.println(f.apply(e));
        }
    }
}