public class Patient {


        // Static variable shared among all patients
        private static String hospitalName = "Global Health Hospital";

        // Static variable to count the total number of patients
        private static int totalPatients = 0;

        // Final variable to uniquely identify each patient
        private final int patientID;

        // Instance variables
        private String name;
        private int age;
        private String ailment;

        // Constructor
        public Patient(String name, int age, String ailment) {
            this.name = name;
            this.age = age;
            this.ailment = ailment;

            // Increment the total patient count and assign a unique ID
            this.patientID = ++totalPatients;
        }

        // Static method to get the total number of patients admitted
        public static int getTotalPatients() {
            return totalPatients;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAilment() {
            return ailment;
        }

        public int getPatientID() {
            return patientID;
        }

        public static String getHospitalName() {
            return hospitalName;
        }

        public static void setHospitalName(String newHospitalName) {
            hospitalName = newHospitalName;
        }

        // Method to display patient details
        public void displayDetails() {
            if (this instanceof Patient) {
                System.out.println("Patient ID: " + patientID);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Ailment: " + ailment);
                System.out.println("Hospital: " + hospitalName);
            } else {
                System.out.println("This object is not an instance of the Patient class.");
            }
        }

        // Main method to demonstrate the functionality
        public static void main(String[] args) {
            // Set hospital name
            Patient.setHospitalName("City Care Hospital");

            // Create patients
            Patient patient1 = new Patient("John Doe", 30, "Flu");
            Patient patient2 = new Patient("Jane Smith", 25, "Fracture");

            // Display details of each patient
            patient1.displayDetails();
            System.out.println();
            patient2.displayDetails();

            // Display total patients admitted
            System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        }
    }


