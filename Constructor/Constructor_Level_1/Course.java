package Constructor_Level_1;
//Design a Course class with:
//Instance Variables: courseName, duration, fee.
//Class Variable: instituteName (common for all courses).
//Methods:
//An instance method display() to display the course details.
//A class method updateInstituteName() to modify the institute name for all courses.

public class Course {
	String courseName; int duration; Double fee;
	 static String instituteName = "Default Institute";
	 public Course(String courseName, int duration, Double fee) {
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	 }
	 public void display() {
	        System.out.println("Course: " + courseName +
	                           ", Duration: " + duration + " weeks" +
	                           ", Fee: " + fee +
	                           ", Institute: " + instituteName);
	    }

	 public static void updateInstituteName(String newName) {
	        instituteName = newName;
	    }
	 public static void main(String[] args) {
	        Course c1 = new Course("Java Programming", 12, 15000.0);
	        Course c2 = new Course("Python Programming", 10, 12000.0);

	        c1.display();
	        c2.display();

	       
	        Course.updateInstituteName("Tech Academy");

	       
	        c1.display();
	        c2.display();
	    }
}
