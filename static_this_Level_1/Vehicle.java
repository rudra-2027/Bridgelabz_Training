package static_this_Level_1;
//Create a Vehicle class with the following features:

//Static:
//○       A static variable registrationFee common for all vehicles.
//○       A static method updateRegistrationFee() to modify the fee.
//This:
//○       Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
//Final:
//○       Use a final variable registrationNumber to uniquely identify each vehicle.
//Instanceof:
//○       Check if an object belongs to the Vehicle class before displaying its registration
//○       details.

public class Vehicle {
	private static double registrationFee = 500;
	private final String registrationNumber;
	private String ownerName;
	private String vehicleType;

	public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.registrationNumber = registrationNumber;
	}

	public static void modifyRegistrationFee(double newFee) {
		if (newFee >= 0.0) {
			registrationFee = newFee;
		} else {
			System.out.println("Invalid registration fee. Please enter a non-negative value.");
		}
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void displayRegistrationDetails() {
		if (this instanceof Vehicle) {
			System.out.println("Owner Name: " + ownerName);
			System.out.println("Vehicle Type: " + vehicleType);
			System.out.println("Registration Number: " + registrationNumber);
			System.out.println("Registration Fee: $" + registrationFee);
		} else {
			System.out.println("The object is not an instance of the Vehicle class.");
		}
	}

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle("Aarav", "Car", "MH12AB1234");
		Vehicle v2 = new Vehicle("Meera", "Bike", "DL05XY9876");

		Vehicle.modifyRegistrationFee(750);
		v1.displayRegistrationDetails();
		v2.displayRegistrationDetails();
	}

}
