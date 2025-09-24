package Encapsulation;

import java.util.ArrayList;
import java.util.List;

/*Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.
*/
interface MedicalRecord {
    void addRecord(String record);

    void viewRecords();
}

abstract class Patient implements MedicalRecord {
    String patientId;
    String name;
    int age;
    String diagnosis;
    List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History of " + name + ":");
        for (String entry : medicalHistory) {
            System.out.println(" " + entry);
        }
    }

    private void showPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }
}

class InPatient extends Patient {
    int days;
    double rate;

    public InPatient(String patientId, String name, int age, String diagnosis, int days, double rate) {
        super(patientId, name, age, diagnosis);
        this.days = days;
        this.rate = rate;
    }

    @Override
    public double calculateBill() {
        return days * rate;
    }
}

class OutPatient extends Patient {
    double fee;

    public OutPatient(String patientId, String name, int age, String diagnosis, double fee) {
        super(patientId, name, age, diagnosis);
        this.fee = fee;
    }

    @Override
    public double calculateBill() {
        return fee;
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        InPatient in = new InPatient("P101", "Ravi", 45, "Pneumonia", 7, 2500);
        OutPatient out = new OutPatient("P102", "Meera", 30, "Fever", 800);

        in.addRecord("Admitted for Pneumonia treatment");
        in.addRecord("Completed 7 days course");
        out.addRecord("Visited for fever checkup");

        in.viewRecords();
        out.viewRecords();

        System.out.println("InPatient Bill: " + in.calculateBill());
        System.out.println("OutPatient Bill: " + out.calculateBill());
    }
}
