package com.busbooking;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Bus {

    public static void displayBuses() {

        try {

            // Get database connection
            Connection con = DBConnection.getConnection();

            // Create statement
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery("SELECT * FROM bus");

            System.out.println("\n===== AVAILABLE BUSES =====");

            while (rs.next()) {

                int busNo = rs.getInt("bus_no");
                String driver = rs.getString("driver_name");
                int capacity = rs.getInt("capacity");

                System.out.println(
                        "Bus No: " + busNo +
                        " | Driver: " + driver +
                        " | Capacity: " + capacity
                );
            }

            rs.close();
            st.close();

        } catch (Exception e) {

            System.out.println("Error displaying buses: " + e.getMessage());

        }
    }
}