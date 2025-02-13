/*
 * In this program we did by default sorting with the help of Comparable bcoz Comparable can only work with one attributes like(Id,salary,serial no) We can use only one on the following, but if we want to sort and customize our sorting on the basis of other attributes than we use Comparator with the help of this we can sort our collection by Id or Salary or serial number.
 * for this we can create multiple classes by implementing comparator in that classes
 * 
 */

 import java.util.*;

 class OurSorting implements Comparator<Person>{                   //Here we create a class which implementing comparator and sorting the collection basis on Id's 

    @Override
    public int compare(Person p1, Person p2) {
        
        if(p1.getId()>p2.getId()){

            return +1;
        } else if(p1.getId()<p2.getId()){

            return -1;
        } else{

            return 0;
        }
    }
 }

 class Person implements Comparable<Person>{                     //Here we implements Comparable in Person(our) class to sort our collection basis on Salary
 
     private int id;
     private String name;
     private double salary;
     
     public Person(int id, String name, double salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
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
 
     public double getSalary() {
         return salary;
     }
 
     public void setSalary(double salary) {
         this.salary = salary;
     }
 
     @Override
     public String toString() {
         return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
     }
 
     @Override
     public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + id;
         result = prime * result + ((name == null) ? 0 : name.hashCode());
         long temp;
         temp = Double.doubleToLongBits(salary);
         result = prime * result + (int) (temp ^ (temp >>> 32));
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
         Person other = (Person) obj;
         if (id != other.id)
             return false;
         if (name == null) {
             if (other.name != null)
                 return false;
         } else if (!name.equals(other.name))
             return false;
         if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
             return false;
         return true;
     }

     public int compareTo(Person p){

       if(this.getSalary()>p.getSalary()){

        return -1;
       } else if(this.getSalary()<p.getSalary()){

        return +1;
       } else{

        return 0;
       }                         
     }
        
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         Person p1 = new Person(110,"rashmika", 9000);
         Person p2 = new Person(102, "Deepika", 8000);
         Person p3 = new Person(122, "katappa", 3000);
 
         TreeSet<Person> t = new TreeSet<>(new OurSorting());              //Here we pass an object of our Customized sorting class, after which the sorting will done on the basis of this class. If we not pass any argument than it will sort on the basis of Comparable(if you have implemented in your class) or natural sorting will done.
         t.add(p1);
         t.add(p2);
         t.add(p3);
 
         System.out.println(t);
     }
 }