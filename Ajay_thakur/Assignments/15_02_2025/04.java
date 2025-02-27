import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Hall implements Comparable<Hall>{

    private String name;
    private String contactNumber;
    private double costPerDay;
    private String ownerName;

    public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Hall [name=" + name + ", contactNumber=" + contactNumber + ", costPerDay=" + costPerDay + ", ownerName="
                + ownerName + "]";
    }

    public int compareTo(Hall h){

        return (int)this.getCostPerDay()-(int)h.getCostPerDay();
    }

}

class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Hall> l = new ArrayList<Hall>();

        System.out.println("Enter the Number of Halls : ");
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++){

            System.out.println("Enter Details of Hall " + (i+1) );

            System.out.println("Enter Name of Hall : ");
            String name = sc.nextLine();

            System.out.println("Enter Contact Number : ");
            String contact = sc.nextLine();

            System.out.println("Enter Per day Cost : ");
            double cost = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter name of the Owner : ");
            String ownerName = sc.nextLine();

            l.add(new Hall(name, contact, cost, ownerName));
        }

        Collections.sort(l);

        for(Hall h:l){

            System.out.println(h);
        }
    }
}