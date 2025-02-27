/*
 * Problem with stream
 */

 import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
 
         l.add(new Employee(101, "nakul", 7800));
         l.add(new Employee(102, "Shrey", 5400));
         l.add(new Employee(103, "Aashish", 3000));
         l.add(new Employee(104, "rohit", 4000));
         l.add(new Employee(105, "vidhi", 800));
 
         System.out.println(l);
         
         List<Employee> l2 = l.stream().filter(x->x.getSalary()>5000).collect(Collectors.toList());

         System.out.println(l2);
     }
 }