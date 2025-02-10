import java.util.Scanner;

public class pr1 {
    
    public static void main(String[] args) {
        
        int empid = 1000, age, sal, choice = 0;

        long mobile;

        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Enter age");
            age = sc.nextInt();

            System.out.println("Enter salary");
            sal = sc.nextInt();

            System.out.println("Enter mobile No.");
            mobile = sc.nextLong();

            System.out.println("Employee details are : ");

            System.out.println("EmpId = " + empid);

            System.out.println("Age = " + age );

            System.out.println("Salary = " + sal);

            System.out.println("Mobile = " + mobile);

            System.out.println("DO you want to continue... Press 1 ");

            choice = sc.nextInt();

            empid++;
        } while(choice==1);
    }
}
