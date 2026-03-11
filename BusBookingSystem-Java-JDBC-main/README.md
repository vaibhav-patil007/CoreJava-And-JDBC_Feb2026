# Bus Booking System (Java + MySQL)

A simple **console-based Bus Booking System** developed using **Core Java and JDBC** with **MySQL database integration**.
This project demonstrates how Java applications interact with relational databases to perform CRUD operations (Create, Read, Update, Delete).

The system allows users to manage bus booking records through a command-line interface.

---

## Features

* View available buses
* Add passenger booking
* View booking details
* Update booking information
* Cancel booking
* MySQL database integration using JDBC

---

## Technologies Used

* **Java (Core Java)**
* **JDBC (Java Database Connectivity)**
* **MySQL Database**
* **Eclipse IDE**
* **Git & GitHub**

---

## Project Structure

```
BusBookingSystem
│
├── src
│   └── com.busbooking
│       ├── DBConnection.java
│       ├── Bus.java
│       ├── Booking.java
│       └── MainApp.java
│
├── database
│   └── bus_booking.sql
│
├── README.md
```

---

## Database Setup

Run the following SQL commands in MySQL:

```sql
CREATE DATABASE bus_booking;

USE bus_booking;

CREATE TABLE bus(
bus_no INT PRIMARY KEY,
driver_name VARCHAR(50),
capacity INT
);

CREATE TABLE booking(
booking_id INT AUTO_INCREMENT PRIMARY KEY,
passenger_name VARCHAR(50),
bus_no INT,
travel_date DATE
);

INSERT INTO bus VALUES (1,'Vaibhav',40);
INSERT INTO bus VALUES (2,'Pratik',35);
INSERT INTO bus VALUES (3,'Mahesh',50);
```
---

## Example Console Output

```
===== BUS BOOKING SYSTEM =====
1. View Buses
2. Add Booking
3. View Bookings
4. Update Booking
5. Cancel Booking
6. Exit
```

---

## Learning Objectives

This project helps in understanding:

* Java database connectivity using JDBC
* SQL CRUD operations
* Integration between Java and MySQL
* Console-based application development

---

## Author

**Pratik Shinde**

---
