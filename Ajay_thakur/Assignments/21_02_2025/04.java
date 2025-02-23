import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;

class Employee{

    private int id;
    private String name;
    private int experience;
    private double rating;
    
    public Employee(int id, String name, int experience, double rating) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", experience=" + experience + ", rating=" + rating + "]";
    }

    
    
}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Employees");
        int num = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> l = new ArrayList<>();
        ArrayList<Employee> eligible = new ArrayList<>();

        for(int i=1; i<=num; i++){

            System.out.println("Enter details of " + i +" employee");

            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int experience = sc.nextInt();
            double rating = sc.nextDouble();

            l.add(new Employee(id, name, experience, rating));
        }

        Predicate<Employee> pr = x->{

            if(x.getExperience()>=3&&x.getRating()>=4.3){

                return true;

            } else{

                return false;
            }
        };

        for(Employee y:l){

            if(pr.test(y)){

                eligible.add(y);
            }
        }

        System.out.println(eligible);
    }
}