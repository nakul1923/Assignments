/*
 * program to implement 
 */

class Employee{

    private int id;
    private String name;
    private double salary;
    private String address;
    private long mobile;
    private boolean status;

    public void setId(int id){

        this.id = id ;
    }

    public int getId(){

        return id ;
    }

    public void setName(String name){

        this.name = name ;
    }

    public String getName(){

        return name ;
    }

    public void setSalary(double salary){

        this.salary = salary ;
    }

    public double getSalary(){

        return salary ;super keyword in java
    }

    public void setAddress(String address){

        this.address = address ;
    }

    public String getAddress(){

        return address ;
    }

    public void setMobile(long mobile){

        this.mobile = mobile ;
    }

    public long getMobile(){

        return mobile ;
    }

    public void setStatus(boolean status){

        this.status = status ;
    }

    public boolean getStatus(){

        return status ;
    }
}

class Demo {
    super keyword in java
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        emp1.setId(1001);
        emp1.setName("nakul");

        Employee emp2 = new Employee();

        emp2.setId(1002);
        emp2.setName("rashmika");

        Employee emp3 = new Employee();

        emp3.setId(1003);
        emp3.setName("pushpa");

        Employee a[] = new Employee[3];

        a[0] = emp1;
        a[1] = emp2;
        a[2] = emp3;

        for(Employee x:a){

            System.out.println(x.getId() + " : " + x.getName());
        }


    }

}
