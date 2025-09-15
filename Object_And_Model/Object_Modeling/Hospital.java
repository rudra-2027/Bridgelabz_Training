package Object_Modeling;
//Problem 3: Hospital, Doctors, and Patients (Association and Communication)
//Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients,
//and each patient can consult multiple doctors.
//Tasks:
//Define a Hospital class containing Doctor and Patient classes.
//Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
//Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
//Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.hospitalName = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void displayDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor d : doctors) {
            System.out.println (d.getName());
        }
    }

    public void displayPatients() {
        System.out.println("Patients in " + hospitalName + ":");
        for (Patient p : patients) {
            System.out.println( p.getName());
        }
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor dr1 = new Doctor("Muskesh");
        Doctor dr2 = new Doctor("J.N");

        Patient Rudra = new Patient("Rudra");
        Patient bob = new Patient("Bob");

        hospital.addDoctor(dr1);
        hospital.addDoctor(dr2);
        hospital.addPatient(Rudra);
        hospital.addPatient(bob);

    
        dr1.consult(Rudra);
        dr1.consult(bob);
        dr2.consult(Rudra);

        hospital.displayDoctors();
        hospital.displayPatients();

        dr1.displayPatients();
        dr2.displayPatients();

        Rudra.displayDoctors();
        bob.displayDoctors();
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient p) {
        if (!patients.contains(p)) {
            patients.add(p);
            p.addDoctor(this);
        }
    }

    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting Patient " + p.getName());
        addPatient(p);
    }

    public void displayPatients() {
        System.out.print("Doctor " + name + " has patients: ");
        for (Patient p : patients) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) {
            doctors.add(d);
        }
    }

    public void displayDoctors() {
        System.out.print("Patient " + name + " has consulted doctors: ");
        for (Doctor d : doctors) {
            System.out.print(d.getName() + " ");
        }
        System.out.println();
    }
}
