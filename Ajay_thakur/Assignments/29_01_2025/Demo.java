import java.util.*;


class Employee{

	
	private String employeeName;
	private int employeeId;
	private 

String employeeDepartment;

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