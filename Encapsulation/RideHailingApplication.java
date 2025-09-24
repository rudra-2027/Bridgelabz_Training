package Encapsulation;

import java.util.ArrayList;
import java.util.List;

/*
 * Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
*/
interface GPS{
	String getCurrentLocation();
	void updateLocation(String Location);

}
abstract class Vechile1 implements GPS{
	String vechileId;
	String driverName;
	double rateKmph;
	private String currentLocation;
	public Vechile1(String vechileId , String driverName, double rateKmph, String currentLocation) {
		this.vechileId = vechileId;
		this.driverName = driverName;
		this.rateKmph = rateKmph;
		this.currentLocation = currentLocation;
		
	}
	public abstract double calculateFare(double distance);
	 public String getVehicleId() {
	        return vechileId;
	    }

	    public String getDriverName() {
	        return driverName;
	    }

	    public double getRatePerKm() {
	        return rateKmph;
	    }
	    public void getVehicleDetails() {
	        System.out.println("Vehicle ID: " + vechileId);
	        System.out.println("Driver Name: " + driverName);
	        System.out.println("Rate per Km: " + rateKmph);
	        System.out.println("Current Location: " + currentLocation);
	    }
	    @Override
	    public String getCurrentLocation() {
	        return currentLocation;
	    }

	    @Override
	    public void updateLocation(String newLocation) {
	        this.currentLocation = newLocation;
	    }
}
class Car2 extends Vechile1{
	public Car2( String vechileId , String driverName, double rateKmph, String Location ){
		super(vechileId, driverName, rateKmph,Location);
	}
	@Override
	public double calculateFare(double distance) {
		 return distance * getRatePerKm();
	}
}
class Bike2 extends Vechile1 {
    public Bike2(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); 
    }
}
class Auto extends Vechile1 {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); 
    }
}
public class RideHailingApplication {
	public static void main(String[] args) {
		 List<Vechile1> vehicles = new ArrayList<>();

        vehicles.add(new Car2("C101", "Rajesh", 15, "Sector 10"));
        vehicles.add(new Bike2("B201", "Amit", 10, "Sector 22"));
        vehicles.add(new Auto("A301", "Suresh", 12, "Sector 5"));
        double distance = 10;
	  for (Vechile1 v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: Rs. " + v.calculateFare(distance));
          
        };
	}
}
