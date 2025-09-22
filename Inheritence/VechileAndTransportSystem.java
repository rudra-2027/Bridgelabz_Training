package Inheritence;
class Vechile{
	int maxSpeed;
	String fuelType;
	Vechile(int maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	void displayDetails() {
		System.out.println("Max Speed are "+maxSpeed);
		System.out.println("Fuel Type "+ fuelType);
	}
}
class Car extends Vechile{
	int setCapacity;
	Car(int maxSpeed,String fuelType, int setCapacity){
		super(maxSpeed,fuelType);
		this.setCapacity = setCapacity;
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Car Capacity is :"+ setCapacity);
	}
}
class Truck extends Vechile{
	int setLoad;
	Truck(int maxSpeed,String fuelType, int setLoad){
		super(maxSpeed,fuelType);
		this.setLoad = setLoad;
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Truck Load  Capacity is :"+ setLoad);
	}
	
}
class Motorcycle extends Vechile{
	
	Motorcycle(int maxSpeed,String fuelType){
		super(maxSpeed,fuelType);
		
	}
	@Override
	void displayDetails() {
		super.displayDetails();
	}
}
public class VechileAndTransportSystem {
	public static void main(String[] args) {
		Vechile[] vehicles = new Vechile[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10000);
        vehicles[2] = new Motorcycle(150, "Petrol");	
        
        for(Vechile v: vehicles)
        {
        	v.displayDetails();
        }

	}

}
