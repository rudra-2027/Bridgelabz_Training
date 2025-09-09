package Constructor_Level_1;
//Create a student class with:
//rollNumber (public).
//name (protected).
//CGPA (private).
//Write methods to:
//Access and modify CGPA using public methods.
//Create a subclass Postgraduatestudent to demonstrate the use of protected members.
class StudentClass {
    public long rollNumber;
    protected String name;
    private float CGPA;

    public StudentClass(long rollNumber, String name, float CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends StudentClass {
    private String specialization;

    public PostgraduateStudent(long rollNumber, String name, float CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate student Name (protected): " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }
}

public class Student {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass(101, "Rudra", 8.5f);
        student1.displayStudentDetails();

        System.out.println();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "A", 9.2f, "Computer Science");
        pgStudent.displayPostgraduateDetails();

        System.out.println();

        pgStudent.setCGPA(9.5f);
        pgStudent.displayPostgraduateDetails();
    }
}