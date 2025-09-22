package Inheritence;
class Course{
	String courseName;
	String duration;
	Course(String courseName,String duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	void displayDetails() {
		System.out.println("Course name : "+courseName);
		System.out.println("Coruse Duration : "+duration);
	}
	
}
class onlineCourse extends Course{
	 String platform;
	 boolean isRecorded;
	 onlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Course Platform online is "+platform);
		System.out.println("Recorded ? : " + isRecorded);
	}
	 
}

class paidOnlineCourse extends onlineCourse{
	double fee;
	double discount;
	paidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount){
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	double feeFinal() {
		return fee-(fee*discount/100);
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Fee of cousre : "+fee);
		System.out.println("Discount on the course fee : "+discount);
		System.out.println("Final Fee is : "+feeFinal());
	}
}
public class Educational_Course_Hierarchy {
	public static void main(String[] args) {
		 Course c1 = new Course("Mathematics", "12 weeks");
		 onlineCourse c2 = new onlineCourse("Java Programming", "8 weeks", "Udemy", true);
		 paidOnlineCourse c3 = new paidOnlineCourse("Data Science Masterclass", "16 weeks", "Coursera", true, 10000, 20);
		 
		 Course[] course = {c1,c2,c3};
		 for(Course c: course) {
			 c.displayDetails();
		 }
		 
	}
}
