package com.encapsulation.hospital_management_system;

// Abstract class Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

// Interface MedicalRecord
/*interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

// Subclass InPatient
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private String medicalHistory;

    public InPatient(int patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return "Medical History:\n" + medicalHistory;
    }
}

// Subclass OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return "Medical History:\n" + medicalHistory;
    }
}

// Main class to demonstrate functionality
public class HospitalManagementSystem {
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            record.addRecord("Initial diagnosis completed.");
            System.out.println(record.viewRecords());
        }
    }

    public static void main(String[] args) {
        Patient inPatient = new InPatient(1, "Alice", 30, 500.0, 5);
        Patient outPatient = new OutPatient(2, "Bob", 40, 300.0);

        System.out.println("Processing In-Patient:");
        processPatient(inPatient);

        System.out.println("\nProcessing Out-Patient:");
        processPatient(outPatient);
    }
}*/

