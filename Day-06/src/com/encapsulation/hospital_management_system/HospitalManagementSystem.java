package com.encapsulation.hospital_management_system;


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
}


