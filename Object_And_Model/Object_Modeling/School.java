package Object_Modeling;

import java.util.ArrayList;
import java.util.List;
//Self Problems
//Problem 1: School and Students with Courses (Association and Aggregation)
//Description: Model a School with multiple Student objects, where each student can enroll in multiple courses,
//and each course can have multiple students.
//Tasks:
//Define School, Student, and Course classes.
//Model an association between Student and Course to show that students can enroll in multiple courses.
//Model an aggregation relationship between School and Student.
//Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
//Goal: Practice association by modeling many-to-many relationships between students and courses.

public class School {
    private String schoolName;
    private List<Student> students;

    public School(String name) {
        this.schoolName = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void display() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            s.display();
        }
    }

    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        Student rahul = new Student("Rahul");
        Student bob = new Student("Bob");

        rahul.enroll(math);
        rahul.enroll(science);

        bob.enroll(science);
        bob.enroll(history);

        School school = new School("GLASchool");
        school.addStudent(rahul);
        school.addStudent(bob);

        school.display();
        math.display();
        science.display();
        history.display();
    }
}

class Student {
    private String stdName;
    private List<Course> courses;

    public Student(String name) {
        this.stdName = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    public void display() {
        System.out.print(" Student: " + stdName + " | Courses: ");
        for (Course c : courses) {
            System.out.print(c.getCourseName() + " ");
        }
        System.out.println();
    }

    public String getName() {
        return stdName;
    }
}

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String name) {
        this.courseName = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public void display() {
        System.out.print("Course: " + courseName + "  Students: ");
        for (Student s : students) {
            System.out.print(s.getName() + " ");
        }
        System.out.println();
    }

    public String getCourseName() {
        return courseName;
    }
}
