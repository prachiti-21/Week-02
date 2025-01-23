import java.util.ArrayList;

class University {
    ArrayList<Uni_Department>departments=new ArrayList<>();
    ArrayList<Faculty>faculties=new ArrayList<>();
    String universityName;
    University(String universityName){
        this.universityName=universityName;
    }

    void addDepartment(Uni_Department department){
        departments.add(department);
    }
    void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }
    void display_unidetails(){
        System.out.println("University name: "+universityName);
        System.out.println("Departments:");
        for(Uni_Department department:departments){
            System.out.println(department.display_dept(department.departmentname));
        }
        for(Faculty faculty: faculties){
            System.out.println(faculty.display_faculty());
        }
    }
  void delete_university(){
      System.out.println("Deleting university: "+ universityName);
      departments.clear();
  }
}
class Uni_Department{
    String departmentname;
    int departmentId;
    Uni_Department(String departmentname,int departmentId){
        this.departmentname=departmentname;
        this.departmentId=departmentId;
    }
    String display_dept(String departmentname){
        return departmentname;
    }
}
    public class Faculty {
    String facultyname;
    String facultydepartment;
    int facultyId;
    Faculty(String facultyname, String facultydepartment,int facultyId){
        this.facultyname=facultyname;
        this.facultydepartment=facultydepartment;
        this.facultyId=facultyId;
    }
    String  display_faculty(){
        return facultyname;
    }

        public static void main(String[] args) {

            //creating university
            University university= new University("RGPV");

            //create faculty members
            Faculty faculty1= new Faculty("Mr. Rajesh","CSE",01);
            Faculty faculty2= new Faculty("Ms Mohan","ECE",02);

            //create departments
            Uni_Department department1= new Uni_Department("CSE",01);
            Uni_Department department2= new Uni_Department("ECE",02);
            Uni_Department department3= new Uni_Department("Mechanical",03);

            //add departments
            university.addDepartment(department1);
            university.addDepartment(department2);
            university.addDepartment(department3);

            //display details
            university.display_unidetails();

            //delete university
            university.delete_university();

            //display faculty members after deleting university
            System.out.println("Faculty exists independently: ");
            System.out.println(faculty1.display_faculty());
            System.out.println(faculty2.display_faculty());




        }
    }



