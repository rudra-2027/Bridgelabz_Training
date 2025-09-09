package Constructor_Level_1;
//Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType,
//and nights. Use default, parameterized, and copy constructors to initialize bookings.
public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	public HotelBooking() {
		// TODO Auto-generated constructor stub
	}
	public HotelBooking(String guestName,
	String roomType,
	int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	public HotelBooking(HotelBooking other) {
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	public void displayBooking() {
        System.out.println("Guest: " + guestName +
                           ", Room Type: " + roomType +
                           ", Nights: " + nights);
    }
	public static void main(String[] args) {
		HotelBooking h1 = new HotelBooking();
		 h1.displayBooking();

        HotelBooking h2 = new HotelBooking("Tohan", "Deluxe", 3);
        h2.displayBooking();

        HotelBooking h3 = new HotelBooking(h2);
        h3.displayBooking();
	}
}
