package com.busbooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Booking {

    // Add Booking
    public void addBooking(String name, int busNo, String date) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO booking(passenger_name, bus_no, travel_date) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, busNo);
            ps.setString(3, date);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Booking Successful!");
            } else {
                System.out.println("Booking Failed!");
            }

            ps.close();

        } catch (Exception e) {

            System.out.println("Error while adding booking: " + e.getMessage());

        }
    }


    // View All Bookings
    public void viewBookings() {

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM booking";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            System.out.println("\n===== BOOKING LIST =====");

            while (rs.next()) {

                int id = rs.getInt("booking_id");
                String name = rs.getString("passenger_name");
                int busNo = rs.getInt("bus_no");
                String date = rs.getString("travel_date");

                System.out.println(
                        "Booking ID: " + id +
                        " | Passenger: " + name +
                        " | Bus No: " + busNo +
                        " | Date: " + date
                );
            }

            rs.close();
            st.close();

        } catch (Exception e) {

            System.out.println("Error while viewing bookings: " + e.getMessage());

        }
    }


    // Update Booking Date
    public void updateBooking(int id, String newDate) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "UPDATE booking SET travel_date=? WHERE booking_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, newDate);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Booking Updated Successfully!");
            } else {
                System.out.println("Booking ID not found.");
            }

            ps.close();

        } catch (Exception e) {

            System.out.println("Error while updating booking: " + e.getMessage());

        }
    }


    // Delete Booking
    public void deleteBooking(int id) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "DELETE FROM booking WHERE booking_id=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Booking Cancelled Successfully!");
            } else {
                System.out.println("Booking ID not found.");
            }

            ps.close();

        } catch (Exception e) {

            System.out.println("Error while deleting booking: " + e.getMessage());

        }
    }
}