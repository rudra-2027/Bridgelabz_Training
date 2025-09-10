package static_this_Level_1;
//Create a Student class to manage student data with the following features:
//Static:
//○       A static variable universityName shared across all students.
//○       A static method displayTotalStudents() to show the number of students enrolled.
//This:
//○       Use this in the constructor to initialize name, rollNumber, and grade.
//Final:
//○       Use a final variable rollNumber for each student that cannot be changed.
//Instanceof:
//○       Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

public class Student {
	private static String universityName;
	private static int totalStudent;
	private String name;
	private int rollNumber;
//	private char garde;
	private char grade;
	public Student(String name, int rollNumber, char grade) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudent++;
	}
	public static void setUniversityName(String name) {
	       universityName = name;
	   }
	 public static void displayTotalStudents() {
	       System.out.println("Total Students Enrolled: " + totalStudent);
	   }
	 public void displayStudentDetails() {
	      
	       if (this instanceof Student) {
	           System.out.println("University Name: " + universityName);
	           System.out.println("Roll Number: " + rollNumber);
	           System.out.println("Name: " + name);
	           System.out.println("Grade: " + grade);
	       } else {
	           System.out.println("The object is not an instance of the Student class.");
	       }
	   }
	  public void updateGrade(char newGrade) {
	      
	       if (this instanceof Student) {
	           this.grade = newGrade;
	           System.out.println("Grade updated to: " + newGrade);
	       } else {
	           System.out.println("The object is not an instance of the Student class.");
	       }
	   }
	  
	   public String getName() {
	       return name;
	   }
	   public int getRollNumber() {
	       return rollNumber;
	   }
	   public char getGrade() {
	       return grade;
	   }


	   public static void main(String[] args) {
		   Student.setUniversityName("ABC University");

	       
	        Student s1 = new Student("Riya", 101, 'A');
	        Student s2 = new Student("Aman", 102, 'B');
	        s1.displayStudentDetails();
	        s2.displayStudentDetails();
	        Student.displayTotalStudents();
	        s1.displayStudentDetails();
            s1.updateGrade('A');
            s2.displayStudentDetails();
            s2.updateGrade('B');

		
	}


}
