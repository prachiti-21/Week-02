public class Student {
    static String universityName="TIT";
    String name;
   final int rollNumber;
   int totalstudents=0;
   int grade;
    Student(String name,int rollNumber,int grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalstudents++;
    }
    void display(){
        System.out.println("University name: "+universityName);
        System.out.println("Name of student: "+name);
        System.out.println("Roll number of student: "+rollNumber);
        System.out.println("Grade: "+grade);
        System.out.println("Total number of students: "+totalstudents);

    }
    void upgradeGrade(int updated_grade,String name){

        System.out.println("Grade updated of the student "+name+" is "+updated_grade);
    }
    public static void main(String args[]){
        Student s1=new Student("Prachiti",109,1);
        Student s2=new Student("Kritz",75,1);
        if(s1 instanceof Student && s2 instanceof Student){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
        System.out.println("Display details of 1st student: ");
        s1.display();
        System.out.println("Display details of 2nd student: ");
        s2.display();
        s1.upgradeGrade(2,"Prachiti");
        s2.upgradeGrade(2,"kritz");


    }
}
