package Inheritence;

class Vehicle {
    String model;
    int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println(" Model: " + model + ", \n Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    int capacity;

    public ElectricVehicle(String model, int maxSpeed, int capacity) {
        super(model, maxSpeed);
        this.capacity = capacity;
    }

    public void charge() {
        displayDetails();
        System.out.println("Electric Vechile can travel upto " + capacity + " kw/h");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int capacity;

    public PetrolVehicle(String model, int maxSpeed, int capacity) {
        super(model, maxSpeed);
        this.capacity = capacity;
    }

    @Override
    public void refuel() {
        displayDetails();
        System.out.println("Petrol Vechile can travel upto " + capacity + " kl/h");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("EV", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Toyota", 180, 55);

        ev.charge();

        pv.refuel();
    }
}
