package Object_Modeling;

import java.util.ArrayList;
import java.util.List;

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

        rahul.enrollCourse(math);
        rahul.enrollCourse(science);

        bob.enrollCourse(science);
        bob.enrollCourse(history);

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

    public void enrollCourse(Course c) {
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
        System.out.print("Course: " + courseName + " | Students: ");
        for (Student s : students) {
            System.out.print(s.getName() + " ");
        }
        System.out.println();
    }

    public String getCourseName() {
        return courseName;
    }
}
