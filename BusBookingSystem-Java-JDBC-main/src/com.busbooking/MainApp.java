package com.busbooking;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Booking booking = new Booking();

        int choice;

        while (true) {

            System.out.println("\n===== BUS BOOKING SYSTEM =====");
            System.out.println("1. View Buses");
            System.out.println("2. Add Booking");
            System.out.println("3. View Bookings");
            System.out.println("4. Update Booking");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Bus.displayBuses();
                    break;

                case 2:
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.next();

                    System.out.print("Enter Bus Number: ");
                    int busNo = sc.nextInt();

                    System.out.print("Enter Travel Date (YYYY-MM-DD): ");
                    String date = sc.next();

                    booking.addBooking(name, busNo, date);
                    break;

                case 3:
                    booking.viewBookings();
                    break;

                case 4:
                    System.out.print("Enter Booking ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter New Travel Date (YYYY-MM-DD): ");
                    String newDate = sc.next();

                    booking.updateBooking(id, newDate);
                    break;

                case 5:
                    System.out.print("Enter Booking ID to Cancel: ");
                    int deleteId = sc.nextInt();

                    booking.deleteBooking(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting Bus Booking System...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}