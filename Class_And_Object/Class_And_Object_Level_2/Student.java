package Class_And_Object_Level_2;
//Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
//To calculate the grade based on the marks.
//To display the student's details and grade.
//Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.

public class Student {
	String name;
	long rollNumber;
	float marks;
	Student(String name,long rollNumber, float marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	String calculateGrade() {
		if(marks>=90) {
			return "O";
		}else if(marks>=80) {
			return "A+";
		}else if(marks>=70) {
			return "A";
		}else if(marks>=60) {
			return "B+";
		}else if (marks>=50) {
			return "B";
			
		}else if(marks>=40) {
			return "C";
		}else if(marks>=35) {
			return "P";
		}
		return "F";
	}
	void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
	public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 85.5f);
        Student s2 = new Student("Priya", 102, 45.0f);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
	
	
}
