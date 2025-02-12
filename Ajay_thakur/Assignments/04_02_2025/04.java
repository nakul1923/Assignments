/*
 * Create a Java program that enables users to dynamically input employee details and store them in an ArrayList.

The program should include a class named "Employee" with private attributes:
1.	employeeName - String
2.	employeeId - int
3.	employeeDepartment - String

The Employee class should have the following methods:
1.	Write a getter method for the above-mentioned attributes.
2.	An overridden toString() method that returns the employee's details.
Input format :
The first line consists of the size of the ArrayList.
The next consecutive line contains employeeName, employeeId, employeeDepartment.
Output format :
The output should display the list of employees.

 */


import java.util.*;


class Employee{

	
	private String employeeName;
	private int employeeId;
	private String employeeDepartment;


	Employee(String employeeName,int employeeId,String employeeDepartment){

		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeName(){

		return employeeName;
	}

	public int getEmployeeId(){

		return employeeId;
	}

	public String getEmployeeDepartment(){

		return employeeDepartment;
	}

	public String toString(){
        return "Name: " + employeeName + " Employee ID: " + employeeId + " Department: " + employeeDepartment;
    	}

}


class Main{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of ArrayList");
		
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<Employee> list = new ArrayList<>(n);

		for(int i=0;i<n;i++){
		
			System.out.println("Enter Employee details");

			String employeeName = sc.nextLine();
			int employeeId = sc.nextInt();
			sc.nextLine();
			String employeeDepartment = sc.nextLine();

			Employee emp = new Employee(employeeName,employeeId,employeeDepartment);
	
			list.add(emp);

		}


		for(Employee employee:list){

				System.out.println(employee);		
			}

	}

}