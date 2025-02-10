import java.util.*;

public class ElectricityBill{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Indore Electricity board\n");
        System.out.println("Enter 1 for Domestic User\nEnter 2 for Commercial user");

        int type = Integer.parseInt(sc.nextLine());

        if(type==1){

            System.out.println("Now you are in Domestic User Page\nEnter Consumer Details\n\nEnter Name");
            String cname = sc.nextLine();
            
            System.out.println("Enter Address: ");
            String caddress = sc.nextLine();

            System.out.println("Enter Consumer Number: ");
            int consNum = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Meter Number");
            int metNum = Integer.parseInt(sc.nextLine());

            System.out.println(cname + " :" + caddress + " :" + consNum +" :" + metNum);

            System.out.println("\nEnter the Month of which you want to generate bill\n");
            String period = sc.nextLine();

            System.out.println("Enter Previous Reading");
            double prevRead = sc.nextInt();

            System.out.println("\nEnter Current Reading");
            double currRead = sc.nextInt();

            

            double unit = currRead - prevRead;

            double rate = 5.50;

            double totalConsumptionCharges = unit*rate;

            double fixedCharges = 30.00;

            double gst = totalConsumptionCharges * 18/100;

            double totalAmountDue = totalConsumptionCharges + fixedCharges + gst;

            if(unit<100){

                totalConsumptionCharges = 0;
                fixedCharges = 0;
                gst = 0;
                totalAmountDue = 0;
                rate = 0;
            }

            System.out.println("-------------------------Your Electricity Bill-------------------------");

            System.out.println("\n\n                Customer Details");

            System.out.println("-----------------------------------------------\n");

            System.out.println("Name                            : " + cname);
            System.out.println("Address                         : " + caddress);
            System.out.println("Consumer Number                 : " + consNum );
            System.out.println("Meter Number                    : " + metNum);

            System.out.println("\n\n                  Bill Details");

            System.out.println("-----------------------------------------------\n");

            System.out.println("Month                           : " + period);
            System.out.println("Previous Reading                : " + prevRead);
            System.out.println("Current Reading                 : " + currRead);
            System.out.println("Units Consumed                  : " + unit);
            System.out.println("Tarrif                          : " + rate + " Rs");

            

            System.out.println("\n\n---------------------Amount-------------------------\n");

            System.out.println("Total Consumption Charges       : " + totalConsumptionCharges + " Rs");
            System.out.println("Fixed Charges                   : " + fixedCharges + " Rs");
            System.out.println("Demand Charges(applicable\nfor Commercial users)           : " + 0.00 +" Rs");
            System.out.println("GST(18%)                        : " + gst + " Rs");

            System.out.println("------------------------------------------------------"+ "");

            System.out.println("Total Amount Due                : " + totalAmountDue + " Rs");
            
        }  else if(type ==2){

            System.out.println("Now you are in Commercial User Page\nEnter Consumer Details\n\nEnter Name");
            String cname = sc.nextLine();
            
            System.out.println("Enter Address: ");
            String caddress = sc.nextLine();

            System.out.println("Enter Consumer Number: ");
            int consNum = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Meter Number");
            int metNum = Integer.parseInt(sc.nextLine());

            System.out.println(cname + " :" + caddress + " :" + consNum +" :" + metNum);

            System.out.println("\nEnter the Month of which you want to generate bill\n");
            String period = sc.nextLine();

            System.out.println("Enter Previous Reading");
            double prevRead = sc.nextInt();

            System.out.println("\nEnter Current Reading");
            double currRead = sc.nextInt();

            

            double unit = currRead - prevRead;

            double rate = 6.50;

            double totalConsumptionCharges = unit*rate;

            double demandCharges = 0;

            if(unit>500){

                demandCharges = 200;
            }

            double fixedCharges = 30.00;

            double gst = totalConsumptionCharges * 18/100;

            double totalAmountDue = totalConsumptionCharges + fixedCharges + gst;

            System.out.println("-------------------------Your Electricity Bill-------------------------");

            System.out.println("\n\n                Customer Details");

            System.out.println("-----------------------------------------------\n");

            System.out.println("Name                            : " + cname);
            System.out.println("Address                         : " + caddress);
            System.out.println("Consumer Number                 : " + consNum );
            System.out.println("Meter Number                    : " + metNum);

            System.out.println("\n\n                  Bill Details");

            System.out.println("-----------------------------------------------\n");

            System.out.println("Month                           : " + period);
            System.out.println("Previous Reading                : " + prevRead);
            System.out.println("Current Reading                 : " + currRead);
            System.out.println("Units Consumed                  : " + unit);
            System.out.println("Tarrif                          : " + rate + " Rs");

            

            System.out.println("\n\n---------------------Amount-------------------------\n");

            System.out.println("Total Consumption Charges       : " + totalConsumptionCharges + " Rs");
            System.out.println("Fixed Charges                   : " + fixedCharges + " Rs");
            System.out.println("Demand Charges(applicable\nfor Commercial users)           : " + demandCharges +" Rs");
            System.out.println("GST(18%)                        : " + gst + " Rs");

            System.out.println("------------------------------------------------------"+ "");

            System.out.println("Total Amount Due                : " + totalAmountDue + " Rs");
            
        }

    }
}
