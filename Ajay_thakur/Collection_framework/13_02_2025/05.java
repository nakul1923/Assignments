/*
 *  In this program we are sorting the array list in which first we use Comparable for default sorting based on id of Person and Second we use Comparator for sorting based on Salary of Persons
 * 
 */

 import java.util.*;


 class Person implements Comparable<Person>,Comparator<Person>{                    
 
     private int id;
     private String name;
     private double salary;

     Person(){


     }
     
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

        if(this.getId()>p.getId()){

            return -1;

        } else if(this.getId()<p.getId()){

            return +1;
        } else{

            return 0;
        }
     }

     public int compare(Person p1, Person p2){

        if(p1.getSalary()>p2.getSalary()){

            return -1;
        } else if(p1.getSalary()<p2.getSalary()){

            return +1;
        } else{

            return 0 ;
        }
     }

     
        
 }
 
 class Main{
 
     public static void main(String[] args) {
         
         Person p1 = new Person(110,"rashmika", 9000);
         Person p2 = new Person(102, "Deepika", 8000);
         Person p3 = new Person(122, "katappa", 3000);
 
         ArrayList<Person> t = new ArrayList();
         t.add(p1);
         t.add(p2);
         t.add(p3);
 
         System.out.println(t);

         Collections.sort(t);                    // Here natural sorting is happening but we used Comparable class for sorting based on Id's 

         System.out.println(t);

         t.sort(new Person());                  // Here we did Customized sorting by using Comparator on basis of Salary's

         System.out.println(t);
     }
 }
