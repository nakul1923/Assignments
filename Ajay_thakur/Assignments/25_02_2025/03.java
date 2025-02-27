import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{

    private int id;
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
                + department + "]";
    }
    
}

class Main{

    public static void main(String[] args) {
        
        ArrayList<Employee> l = new ArrayList<>();

        l.add(new Employee(101, "nakul", 32, 90000, "IT"));
        l.add(new Employee(102, "Shrey", 31, 80000, "IT"));
        l.add(new Employee(103, "rohit", 22, 75000, "HR"));
        l.add(new Employee(104, "sandeep", 24, 48000, "Business"));
        l.add(new Employee(105, "Manish", 23, 45000, "IT"));
        l.add(new Employee(106, "Yashika", 30, 64000, "HR"));
        l.add(new Employee(107, "Abhishek", 35, 95000, "Management"));
        l.add(new Employee(108, "Yachika", 29, 35000, "Management"));


        List<Employee> greaterSalary = l.stream().filter(x->x.getSalary()>50000).collect(Collectors.toList());

        System.out.println("employees who have a salary greater than 50,000 are \n");

        for(Employee s:greaterSalary){

            System.out.println("Name = " + s.getName() + " salary = " + s.getSalary());
        }

        System.out.println("employees who belong to the \"IT\" department are \n");

        List<Employee> ITdep = l.stream().filter(x->x.getDepartment().equals("IT")).collect(Collectors.toList());

        for(Employee s:ITdep){

            System.out.println("Name = " + s.getName() + " Department = " + s.getDepartment());
        }

        System.out.println("Employees who are older than 30 years are \n");

        List<Employee> older = l.stream().filter(x->x.getAge()>30).collect(Collectors.toList());

        for(Employee s:older){

            System.out.println("Name = " + s.getName() + " Age = " + s.getAge());
        }

        System.out.println("Employees whose names start with 'M' are \n");

        List<Employee> nameWithM = l.stream().filter(x->x.getName().startsWith("m")||x.getName().startsWith("M")).collect(Collectors.toList());

        for(Employee s:nameWithM){

            System.out.println("Name = " + s.getName());
        }

    }
}