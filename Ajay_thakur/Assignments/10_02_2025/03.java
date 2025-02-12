/*
 * Write a Java program that enables users to dynamically input employee details and store them in a HashSet to ensure no duplicate employees (based on employeeId).

The program should include a class named Employee with private attributes:

employeeName - String
employeeId - int
employeeDepartment - String
The Employee class should have the following methods:

Getter methods for the above-mentioned attributes.
An overridden toString() method that returns the employee's details.
Implement hashCode() and equals() to prevent duplicate employees based on employeeId.
Input format:
The first line consists of the number of employees.
The next consecutive lines contain employeeName, employeeId, and employeeDepartment.
Output format:
Display the list of employees (duplicates should be ignored).

 */

import java.util.*;

class Employee{

    private String name;
    private int id;
    private String department;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
    }

    public int hashCode() {
        
        return Objects.hash(id);
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
    
}

class Main{

    public static void main(String[] args) {

        HashSet<Employee> hs = new HashSet<>();
        
        Employee emp1 = new Employee("nakul", 101, "IT");
        Employee emp2 = new Employee("Rohit", 101, "management");
        Employee emp3 = new Employee("Shrey", 102, "Science");

        hs.add(emp1);
        hs.add(emp2);
        hs.add(emp3);
        System.out.println(hs);

    }
}