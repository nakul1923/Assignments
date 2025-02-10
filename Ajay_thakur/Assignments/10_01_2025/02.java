import java.util.Scanner;

interface Ride{

    public double calculateFare(double distance);
    
}

class BikeRide implements Ride{

    double rate = 10;

    public double calculateFare(double distance){

        double fare = distance * rate;

        return fare;
    }

}

class CarRide implements Ride{

    double rate = 20;

    public double calculateFare(double distance){

        double fare = distance * rate;

        return fare;
    }


}

class BusRide implements Ride{

    double rate = 5;

    public double calculateFare(double distance){

        double fare = distance * rate;

        return fare;
    }

}

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Distance of Bike ride : ");

        double distance  = sc.nextDouble();
        
        Ride obj1 = new BikeRide();



        System.out.println(obj1.calculateFare(distance));

        System.out.println("Enter the Distance of Car ride : ");

        double distancecar  = sc.nextDouble();
        
        Ride obj2 = new CarRide();



        System.out.println(obj2.calculateFare(distancecar));

        System.out.println("Enter the Distance of Bus ride : ");

        double distancebus  = sc.nextDouble();
        
        Ride obj3 = new BusRide();



        System.out.println(obj3.calculateFare(distancebus));


        
    }
}


