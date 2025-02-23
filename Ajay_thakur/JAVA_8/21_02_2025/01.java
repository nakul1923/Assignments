import java.util.ArrayList;
import java.util.function.Predicate;

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

    
}
class Main{

    public static void main(String[] args) {
        
        Employee e1 = new Employee(101, "abc", 4000);
        Employee e2 = new Employee(102, "xyz", 3000);
        Employee e3 = new Employee(103, "katappa", 9000);
        Employee e4 = new Employee(104, "rashmika", 40000);

        ArrayList<Employee> l = new ArrayList<>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);

        Predicate<Employee> obj = x->{

            if(x.getSalary()>5000){

                return true;
            } else {

                return false;
            }
        };

        for(Employee y:l){

            if(obj.test(y)){

                System.out.println(y.getName());
            }
        }
    }
}