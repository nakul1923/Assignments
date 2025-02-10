import java.util.*;

class Employee{


    String firstName;
    String lastName;
    double mobile;
    String address;
    int salary;

    Employee(String firstName, String lastName, double mobile, String address, int salary){

        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
        this.salary = salary;
    }

    void getDetails(){

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(mobile);
        System.out.println(address);
        System.out.println(salary);
    }
}

class Manager extends Employee{

    int bonus;
    String designation;

    Manager(String firstName, String lastName, double mobile, String address, int salary,int bonus, String designation){

        super(firstName,lastName,mobile,address,salary);

        this.bonus = bonus;
        this.designation = designation;
    }

    void getDetails() {
        super.getDetails();
        System.out.println(bonus);
        System.out.println(designation);
    }
    
}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name : ");
        String fname = sc.nextLine();
        System.out.println("Enter Last Name : ");
        String lname = sc.nextLine();
        System.out.println("Enter Mobile : ");
        double mobile = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Address : ");
        String address = sc.nextLine();
        System.out.println("Enter Salary : ");
        int salary = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Bonus : ");
        int bonus = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Designation : ");
        String designation = sc.nextLine();

        Manager obj1 = new Manager(fname, lname, mobile, address, salary, bonus, designation);

        obj1.getDetails();
    }
}