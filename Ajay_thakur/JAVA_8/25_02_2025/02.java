/*
 * Problem without Stream
 */

import java.util.ArrayList;

class Employee{

    int id;
    String name;
    double salary;
    
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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    
    
}

class Main{

    public static void main(String[] args) {
        
        ArrayList<Employee> l = new ArrayList<>();
        ArrayList<Employee> salary = new ArrayList<>();

        l.add(new Employee(101, "nakul", 7800));
        l.add(new Employee(102, "Shrey", 5400));
        l.add(new Employee(103, "Aashish", 3000));
        l.add(new Employee(104, "rohit", 4000));
        l.add(new Employee(105, "vidhi", 800));

        for(Employee e:l){

            if(e.getSalary()>5000){

                salary.add(e);
            }
        }

        System.out.println(salary);
    }
}