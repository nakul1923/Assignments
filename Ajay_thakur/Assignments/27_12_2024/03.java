class Employee{

    int empId;
    float salary;

    Employee(int empId, float salary){

        this.empId = empId;
        this.salary = salary;
    }
}

class EmployeeLevel extends Employee{

    EmployeeLevel(int empId, float salary){

        super(empId,salary);
    }

    int empLevel(){

        if(this.salary>100){
            
            return 1;
        } else {

            return 2;
        }
    } 
}

class Main{

    public static void main(String[] args) {
        
        EmployeeLevel emp1 = new EmployeeLevel(101, 110);

        System.out.println("Id : " + emp1.empId + "\nSalary : " + emp1.salary + "\nLevel : " + emp1.empLevel());

        EmployeeLevel emp2 = new EmployeeLevel(102, 90);

        System.out.println("Id : " + emp2.empId + "\nSalary : " + emp2.salary + "\nLevel : " + emp2.empLevel());
    }
}