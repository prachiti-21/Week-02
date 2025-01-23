import java.lang.reflect.Array;
import java.util.ArrayList;

class Hospital {

    public String hospitalname;

    private ArrayList<Patientt>patients=new ArrayList<>();

    private ArrayList<Doctor>doctors= new ArrayList<>();

    Hospital(String hospitalname){
        this.hospitalname=hospitalname;
    }

    void addPatients(Patientt patient){
        patients.add(patient);
    }
    void addDoctors(Doctor doctor){
        doctors.add(doctor);
    }
    void display_hosplitaldetails(){
        System.out.println("Hospital: "+hospitalname);
        System.out.println("Doctors:");
        for(Doctor doctor: doctors){
            System.out.println(doctor.display_doctorname());
        }
        System.out.println("Patients:");
        for(Patientt patient: patients){
            System.out.println(patient.display_patientname());
        }
    }


}
public class Patientt {
     String patientname;
    int patientage;
    Patientt(String patientname, int patientage){
        this.patientname=patientname;
        this.patientage=patientage;
    }
    String display_patientname(){
        return patientname;
    }
    int display_patientage(){
        return patientage;
    }
    }
    class Doctor{
     String doctorname;
     String specialization;
     Doctor(String doctorname, String specialization){
         this.doctorname=doctorname;
         this.specialization=specialization;
     }
     String display_doctorname(){
         return doctorname;
     }
     String display_specialization(){
         return specialization;
     }
     void consult(Patientt patient){
         System.out.println(patient.patientname+" consults with "+ doctorname);
     }
        public static void main(String[] args) {
            Hospital hospital=new Hospital("City Hospital");
            //creating patients
            Patientt patient1= new Patientt("Swati",32);
            Patientt patient2= new Patientt("Raj",45);

            //creating doctors
            Doctor doctor1= new Doctor("Dr.Meena","Gynecologist");
            Doctor doctor2= new Doctor("Dr.Anil","Orthopedic");

            //adding patients
            hospital.addPatients(patient1);
            hospital.addPatients(patient2);

            //adding doctors
            hospital.addDoctors(doctor1);
            hospital.addDoctors(doctor2);

            //hospital details
            hospital.display_hosplitaldetails();

            //consultation of patients with respective doctors
            System.out.println("Consultation Details:");
            doctor1.consult(patient1);
            doctor2.consult(patient2);




        }
    }


