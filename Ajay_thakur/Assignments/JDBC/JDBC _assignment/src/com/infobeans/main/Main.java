package com.infobeans.main;

import com.infobeans.Service.BookingsService;
import com.infobeans.model.Bookings;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        BookingsService bookingsService = new BookingsService();

        while(true){

            System.out.println("\n1. Add Booking\n2. View Bookings\n3. Get booking by ID\n4. Update the checkout date by Id\n5. Cancel booking by ID");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice){


                case 1 :
                    System.out.println("Enter Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter guest name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter room number: ");
                    int roomNo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter check in date: ");
                    String checkInDate = sc.nextLine();
                    System.out.println("Enter check out date: ");
                    String checkOutDate = sc.nextLine();
                    System.out.println("Enter total amount: ");
                    double totalAmount = sc.nextDouble();
                    sc.nextLine();

                    Bookings booking = new Bookings(id,name,roomNo,checkInDate,checkOutDate,totalAmount);
                    bookingsService.addBookings(booking);
                    break;

                case 2 :

                    List<Bookings> bookings = bookingsService.fetchAllBookings();

                    System.out.println("\nBookings List");

                    for(Bookings b : bookings){

                        System.out.println(b.getBookingId() + " | " + b.getGuestName() + " | " + b.getRoomNumber() + " | " + b.getCheckInDate() + " | " + b.getCheckOutDate() + " | " + b.getTotalAmount());

                    }
                    break;

                case 3:

                    System.out.println("Enter id to fetch details: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    Bookings bookings1 = bookingsService.fetchBookingById(id1);
                    System.out.println("Booking with ID: ");

                    System.out.println(bookings1.getBookingId() + " | " + bookings1.getGuestName() + " | " + bookings1.getRoomNumber() + " | " + bookings1.getCheckInDate() + " | " + bookings1.getCheckOutDate() + " | " + bookings1.getTotalAmount());

                case 4:

                    System.out.println("Enter id: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new Check out date");
                    String date = sc.next();

                    if(bookingsService.changeCheckOut(id2,date)){

                        System.out.println("data updated successfully");
                    } else{

                        System.out.println("there is no data available with thid id");
                    }
            }

        }
    }
}
