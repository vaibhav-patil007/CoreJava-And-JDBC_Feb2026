package com.busbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {

        try {

            if (con == null || con.isClosed()) {

                // Load MySQL JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create Connection
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bus_booking",
                        "root",
                        "root"
                );

            }

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL Driver not found.");
            e.printStackTrace();

        } catch (SQLException e) {

            System.out.println("Database connection failed.");
            e.printStackTrace();

        }

        return con;
    }
}