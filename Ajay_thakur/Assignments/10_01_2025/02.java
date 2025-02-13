/*
 *  Ride-Sharing Platform
Scenario:
A ride-sharing platform needs to calculate the fare for different types of rides such as bikes, cars, and shared rides. Each ride type has its own way of calculating fares.

Interface: Ride
Method: double calculateFare(double distance)
Scenario Task:
Create classes BikeRide, CarRide, and SharedRide to calculate fares based on specific distance rates. Write a program to take user input for ride type and distance, and display the fare.
 */

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


