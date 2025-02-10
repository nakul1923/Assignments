/*
 * 
 * 
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

        return salary ;
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
    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        emp1.setId(1001);
        System.out.println(emp1.getId());

        emp1.setName("Raj");
        System.out.println(emp1.getName());

        emp1.setSalary(10000.00);
        System.out.println(emp1.getSalary());

        emp1.setAddress("indore malharganj");
        System.out.println(emp1.getAddress());

        emp1.setMobile(7894561236l);
        System.out.println(emp1.getMobile());

        emp1.setStatus(true);
        System.out.println(emp1.getStatus());
    }

}
