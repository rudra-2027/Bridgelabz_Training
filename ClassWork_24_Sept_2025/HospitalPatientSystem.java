package ClassWork_24_Sept_2025;
abstract class Patient{
	String patientId;
	String pName;
	int pAge;
	Patient(String patientId,String pName, int pAge){
		this.patientId = patientId;
		this.pName = pName;
		this.pAge = pAge;
	}
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return pName;
    }

    public int getAge() {
        return pAge;
    }


    public double calculateFees() {
        return 0.0;
    }

    public String getPatientDetails() {
        return " Patient ID: " + patientId + ", \n Name: " + pName + ", \n Age: " + pAge;
    }
	
}
class Doctor{
	String doctorId;
	String dName;
	String specialization;
    public Doctor(String doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.dName = name;
        this.specialization = specialization;
    }
	public String getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return dName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getDoctorDetails() {
        return " Doctor ID: " + doctorId + ", \n Name: " + dName + ", \n Specialization: " + specialization;
    }
}
class Appointment{
	private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }
    public void showAppointment() {
        System.out.println("Patient Details: ");
        System.out.println(patient.getPatientDetails());
        System.out.println("-----------------------------------");
        System.out.println("Doctor Details: ");
        System.out.println(doctor.getDoctorDetails());
        System.out.println("-----------------------------------");
//        System.out.println("Doctor: " + doctor.getName() + " with specializaiton " + doctor.getSpecialization());
        System.out.println("Appointment Details: ");
        System.out.println("Date: " + date + ", Time: " + time);
        System.out.println("Calculated Fees: " + patient.calculateFees());
        System.out.println("-----------------------------------");
      
    }
}



class Inpatient extends Patient{
	int days;
	double rates;
	public Inpatient(String patientId, String name, int age, int days, double rates) {
		super(patientId,name,age);
		this.days = days;
		this.rates = rates;
	}
	@Override
    public double calculateFees() {
        return days * rates;
    }
}
class Outpatient extends Patient{
	double rates;
	public Outpatient(String patientId, String name, int age, double rates) {
		super(patientId,name,age);
		
		this.rates = rates;
	}
	@Override
    public double calculateFees() {
        return rates;
    }
}
public class HospitalPatientSystem {
	public static void main(String[] args) {
		Doctor doc = new  Doctor("D1","Dr. Rohan","Cardiology");
		Inpatient inP = new Inpatient("P1","Person 1",20,5,500);
		Outpatient outP = new Outpatient("P2","Person 2",28,800);
		Appointment a1 = new Appointment(inP,doc,"23/Sept/2025","12:30");
		Appointment a2 = new Appointment(outP,doc,"23/Sept/2025","5:30");
		a1.showAppointment();
		a2.showAppointment();
	}
	
	
}
