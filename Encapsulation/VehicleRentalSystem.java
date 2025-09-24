package Encapsulation;
/*
 * 3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
*/

import java.util.*;

abstract class Vehicle implements Insurable {
    String vehicleNumber;
    String vehicleType;
    double rentalRate;

    public Vehicle(String vehicleNumber, String vehicleType, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public double calculateInsurance() {
        return 0;
    }

    public String getInsuranceDetails() {
        return "No insurance available.";
    }
}

interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

class Car extends Vehicle {
    String policyNumber;

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + policyNumber;
    }
}

class Bike extends Vehicle {
    String policyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + policyNumber;
    }
}

class Truck extends Vehicle {
    String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + policyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("C123", 50, "1"),
                new Bike("B123", 30, "2"),
                new Truck("T123", 100, "3")
        };

        calculateTotalCost(vehicles, 5);
    }

    public static void calculateTotalCost(Vehicle[] vehicles, int days) {
        double totalRentalCost = 0;
        double totalInsuranceCost = 0;

        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = vehicle.calculateInsurance();
            String insuranceDetails = vehicle.getInsuranceDetails();

            System.out.println("Vehicle: " + vehicle.vehicleType + ", Number: " + vehicle.vehicleNumber);
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println(insuranceDetails);

            totalRentalCost += rentalCost;
            totalInsuranceCost += insuranceCost;
        }

        System.out.println("Total Rental Cost: " + totalRentalCost);
        System.out.println("Total Insurance Cost: " + totalInsuranceCost);
        System.out.println("Total Cost (Rental + Insurance): " + (totalRentalCost + totalInsuranceCost));
    }
}
