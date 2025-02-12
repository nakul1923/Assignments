import java.util.*;

class Employee{

    int id;
    String name;
    double salary;

    public Employee(int id,String name,double salary){

        super();
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    

    public String toString(){

        return "Employee [id= " + id + ", name= " + name + ", salary=" + salary;
    }

    public int hashCode(){

        return Objects.hash(id, name, salary);
    }

    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(obj == null){

            return false;
        }
        if(getClass() != obj.getClass()){

            return false;

        }

        Employee employee = (Employee) obj;

        if(id != employee.id){

            return false;
        }

        return name !=null ? name.equals(employee.name) : employee.name == null;
    }
    
}

class Main{

    public static void main(String[] args) {
        
        Employee e1 = new Employee(101 , "deepika", 9000);
        Employee e2 = new Employee(102 , "rashmika", 6000);
        Employee e3 = new Employee(101 , "deepika", 9000);

        System.out.println(e1);
        System.out.println(e2);

        HashSet<Employee> h = new HashSet<Employee>();

        h.add(e1);
        h.add(e2);
        h.add(e3);

        System.out.println(h);
    }
}