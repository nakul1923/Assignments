/*
 * Railway Reservation System
Scenario: A railway booking system stores passenger reservations. Each Passenger has attributes like ticketNumber, name, source, destination, and seatNumber.

Tasks:

Use LinkedList<Passenger> to store reservations.
Add new reservations at the end of the list.
Cancel a reservation by ticketNumber.
Display all reserved tickets.
 */


import java.util.*;

class Passenger{

    private int ticketNumber;
    private String name;
    private String source;
    private String destination;
    private String seatNumber;

    public Passenger(int ticketNumber, String name, String source, String destination, String seatNumber) {
        this.ticketNumber = ticketNumber;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "RailwayReservation [ticketNumber=" + ticketNumber + ", name=" + name + ", source=" + source
                + ", destination=" + destination + ", seatNumber=" + seatNumber + "]";
    }

    
}

class RailwayReservation{

    LinkedList<Passenger> passengers = new LinkedList<>();

    public void reservation(Passenger p){

        passengers.add(p);

        System.out.println("Reservation done of passenger " + p.getName());
    }

    public void cancel(int ticketNumber){

        Iterator<Passenger> itr =  passengers.iterator();

        while(itr.hasNext()){

            Passenger passenger = itr.next();

            if(passenger.getTicketNumber()==ticketNumber){

                itr.remove();

                System.out.println("Cancelled reservation of passenger " + passenger.getName());
            }
        }
    }

    public void displayAllTickets(){

        for(Passenger passenger:passengers){

            System.out.println(passenger);
        }
    }

}

class Main{

    public static void main(String[] args) {
        
        RailwayReservation railwayReservation = new RailwayReservation();

        railwayReservation.reservation(new Passenger(1001, "nakul", "ratlam", "indore", "p1"));
        railwayReservation.reservation(new Passenger(1002, "rohit", "indore", "mumbai", "s4"));
        railwayReservation.reservation(new Passenger(1003, "shrey", "ujjain", "pune", "a7"));

        railwayReservation.displayAllTickets();

        railwayReservation.cancel(1002);

        railwayReservation.displayAllTickets();

    }
}

