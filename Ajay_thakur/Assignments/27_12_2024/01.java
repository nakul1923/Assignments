class Person{

    String firstName;
    String lastName;
}

class Employee extends Person{

    int employeeId;
    String jobTitle;

    void setFirstName(String firstName){

        super.firstName = firstName;
       
    }
    void getFirstName(){

            System.out.println("First Name : "+ super.firstName);
    }

    void setLastName(String lastName){

        super.lastName = lastName;
    }

    void getLastName(){

        System.out.println("Last Name : " + super.lastName);
    }

    void setEmployeeId(int employeeId){

        this.employeeId = employeeId ;
    }

    void getEmployeeId(){

        System.out.println("Employee Id : " + employeeId);
    }

    void setJobTitle(String jobTitle){

        this.jobTitle = jobTitle ;
    }

    void getJobTitle(){

        System.out.println("Job Title : " + jobTitle);
    }

}

class Main{

    public static void main(String[] args) {
        
        System.out.println("Input details of an employee");

        Employee emp1 = new Employee();

        emp1.setFirstName("nakul");
        emp1.setLastName("panchal");
        emp1.setEmployeeId(302);
        emp1.setJobTitle("Project Manager");

        emp1.getFirstName();
        emp1.getLastName();
        emp1.getEmployeeId();
        emp1.getJobTitle();

    }
}