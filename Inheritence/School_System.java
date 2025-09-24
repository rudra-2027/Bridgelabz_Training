package Inheritence;

class Person {
 String name;
 int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayDetails() {
     System.out.println(" Name: " + name + ", \n Age: " + age);
 }
 

 public void displayRole() {
     
 }
}


class Teacher extends Person {
 String subject;

 public Teacher(String name, int age, String subject) {
     super(name, age); 
     this.subject = subject;
 }

 @Override
 public void displayRole() {
     super.displayDetails();
     System.out.println("Teacher have  Subject: " + subject);
 }
}

class Student extends Person {
 String grade;

 public Student(String name, int age, String grade) {
     super(name, age);
     this.grade = grade;
 }

 @Override
 public void displayRole() {
     super.displayDetails();
     System.out.println("Student having  Grade: " + grade);
 }
}


class Staff extends Person {
 String department;

 public Staff(String name, int age, String department) {
     super(name, age);
     this.department = department;
 }

 @Override
 public void displayRole() {
     super.displayDetails();
     System.out.println("Staff having Department: " + department);
 }
}

public class School_System {
 public static void main(String[] args) {
     Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
     Student student = new Student("Anjali", 15, "10th Grade");
     Staff staff = new Staff("Ramesh", 35, "Administration");

     teacher.displayRole();
     
     student.displayRole();
     
     staff.displayRole();
 }
}
