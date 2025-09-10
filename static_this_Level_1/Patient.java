package static_this_Level_1;

//Create a Patient class with the following features:
//Static:
//○       A static variable hospitalName shared among all patients.
//○       A static method getTotalPatients() to count the total patients admitted.
//This:
//○       Use this to initialize name, age, and ailment in the constructor.
//Final:
//○       Use a final variable patientID to uniquely identify each patient.
//Instanceof:
//○       Check if an object is an instance of the Patient class before displaying its details.
public class Patient {
	private static String hospitalName;
	private static int totalPatients;
	private final String patientID;
	private String name;
	private int age;
	private String ailment;

	public Patient(String name, int age, String ailment, String patientID) {
		this.name = name;
		this.age = age;
		this.ailment = ailment;
		this.patientID = patientID;
		totalPatients++;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAilment() {
		return ailment;
	}

	public String getPatientID() {
		return patientID;
	}

	public void displayPatientDetails() {

		if (this instanceof Patient) {
			System.out.println("Hospital Name: " + hospitalName);
			System.out.println("Patient ID: " + patientID);
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Ailment: " + ailment);
		} else {
			System.out.println("The object is not an instance of the Patient class.");
		}
	}

	public static void setHospitalName(String name) {
		hospitalName = name;
	}

	public static int getTotalPatients() {
		return totalPatients;
	}

	public static void main(String[] args) {
		Patient.setHospitalName("City Care Hospital");

		Patient p1 = new Patient("Rahul", 30, "Fever", "P101");
		Patient p2 = new Patient("Sneha", 25, "Fracture", "P102");
		System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());

		p1.displayPatientDetails();
		p2.displayPatientDetails();

	}

}
