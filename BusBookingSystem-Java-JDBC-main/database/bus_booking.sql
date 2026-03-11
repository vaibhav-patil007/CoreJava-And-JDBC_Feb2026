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