package Object_Modeling;

import java.util.*;
//Problem 5: University Management System
//Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses.
//Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
//Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, 
//and courses.

public class UniversityManagement {
	
	 public static void main(String[] args) {
	        Student1 s1 = new Student1("Ram");
	        Student1 s2 = new Student1("Allice");
	        Professor p1 = new Professor("Dr. Smith");
	        Course1 c1 = new Course1("Data Structures");

	        p1.assignCourse(c1);
	        s1.enroll(c1);
	        s2.enroll(c1);

	        c1.showDetails();
	    }
}
class Student1{
	private String stdName;
	List<Course1> courses  = new ArrayList<>();
	Student1(String name){
		this.stdName = name;
	}
	void enroll(Course1 c) {
		courses.add(c);
		c.students.add(this);
		System.out.println(stdName + " enrolled in " + c.name);
	}
	 String getName() {   
	        return stdName;
	    }
}
class Professor{
	String name;
	List<Course1> courses = new ArrayList<>();
	Professor(String name){
		this.name = name;
		
		
	}
	 void assignCourse(Course1 c) {
	        courses.add(c);
	        c.professor = this;
	        System.out.println(name + " teaches " + c.name);
	    }
	
}
class Course1{
	String name;
    Professor professor;
    List<Student1> students = new ArrayList<>();

    Course1(String name) { 
    	this.name = name; 
    	}

    void showDetails() {
        System.out.println("\nCourse: " + name);
        System.out.println("Professor: " + professor.name);
        System.out.print("Students: ");
        for (Student1 s : students) {
        	System.out.print(s.getName() + " ");
        	
        }
        System.out.println();
    }
}
